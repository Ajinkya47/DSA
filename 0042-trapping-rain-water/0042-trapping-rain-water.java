class Solution {
    public int trap(int[] height) {

        // int[] prefixMax=new int[height.length];
        // prefixMax[0]=height[0];
        // for(int i =1;i<height.length;i++){
        //     prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
        // }

        // int[] suffixMax= new int[height.length];
        // suffixMax[height.length-1]=height[height.length-1];
        // for(int i =height.length-2;i>=0;i--){

        //     suffixMax[i]=Math.max(suffixMax[i+1],height[i]);

        // }
        // int totalWater=0;
        // for(int i =0;i<height.length;i++){
            
        //     if(prefixMax[i]>height[i] && suffixMax[i]>height[i]){

        //         totalWater+=Math.min(prefixMax[i],suffixMax[i])-height[i];


        //     }

            
        // }

        // return totalWater;
        


        int n =height.length;
        int left=0;
        int right=n-1;
        int lMax=0;
        int rMax=0;
        int totalWater=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(lMax>=height[left]){
                    totalWater+=lMax-height[left];
                }
                else lMax=height[left];
                left++;
                
            }
            
            else{
                if(rMax>=height[right]){
                    totalWater+=rMax-height[right];
                }
                else rMax=height[right];
                right--;
                
            }
            
        }

        return totalWater;
    }
}