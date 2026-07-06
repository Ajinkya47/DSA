class Solution {

    public static boolean isPossible(int[] bloomDay, int day ,int m , int k){

        int bouqets=0;
        int count=0;
        for(int bloom :bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouqets++;
                    count=0;
                }
            }
            else{
                count=0;
            }

            
        }

        return bouqets>=m;

    }
    public int minDays(int[] bloomDay, int m, int k) {

        long totalFlowers=(long)m*k;
        if(totalFlowers>bloomDay.length) return -1;
        
        int minDay=Integer.MAX_VALUE;
        int maxDay=Integer.MIN_VALUE;

        for(int i : bloomDay){

            minDay=Math.min(minDay,i);
            maxDay=Math.max(maxDay,i);

        }


        int low = minDay;
        int high=maxDay;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;

        
    }
}