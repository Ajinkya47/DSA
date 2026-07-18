class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
    //     for (int i = 0; i < n; i++) {
    //         int count = 0;
            
    //         for (int j = 0; j < n; j++) {
    //             if (nums[j] == nums[i]) {
    //                 count++;
    //             }
    //         }
            
    //         if (count == 1) {  // Changed: check if count is 1, not nums[j]
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }
    int xor =0;
    for(int i =0;i<n;i++){

        xor=xor^nums[i];
        

    }
    return xor;
    }

}