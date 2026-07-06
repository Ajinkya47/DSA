class Solution {

    public int CalculateDays(int[]weights,int capacity){
        int sum=0;
        int day=1;
        for(int w :weights){
            
            if(w+sum>capacity){

                day++;

                sum=w;

                


            }
            else{
                sum=sum+w;
            }
            
            

        }

        return day;

    }
    public int shipWithinDays(int[] weights, int days) {

        int low=Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        int ans = -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(CalculateDays(weights,mid)<=days){
                ans = mid;
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }

        return ans;


        
    }
}