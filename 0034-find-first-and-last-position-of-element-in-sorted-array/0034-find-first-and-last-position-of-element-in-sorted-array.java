class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] result=new int[2];

        result[0]=findfirst(nums,target);
        result[1]=findlast(nums,target);

        return result;
        
    }

    private int findfirst(int [] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans=-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high = mid-1;
            }

            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }

    private int findlast(int[] nums, int target){

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int last=-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low = mid+1;
            }
            else if(nums[mid]>target){
                high  = mid-1;
                
            }
            else{
                low = mid+1;
            }
        }
        return last;

    }


    


}