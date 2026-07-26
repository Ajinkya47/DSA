class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int low =0;
        int high=n-1;
        int maxWater=0;

        while(low<high){

            int height1=Math.min(height[low],height[high]);
            int width1=high-low;

            int Water= height1*width1;

            maxWater=Math.max(maxWater,Water);

            if(height[low]<height[high]){
                low++;
            }
            else high--;

        }

        return maxWater;
      
    }
}