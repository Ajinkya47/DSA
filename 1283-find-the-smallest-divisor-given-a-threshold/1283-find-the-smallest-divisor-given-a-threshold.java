class Solution {

    public int sumOfDivisior(int[] nums,int divisor){
        int divSum=0;
        for(int num :nums){
            divSum+=(Math.ceil((double)num/divisor));

        }

        return divSum;

    }
    public int smallestDivisor(int[] nums, int threshold) {


        int low = 1;
        int high= Arrays.stream(nums).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumOfDivisior(nums,mid)<=threshold){
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