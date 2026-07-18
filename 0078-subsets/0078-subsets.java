class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        ArrayList<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int subset=1<<n;
        for(int num=0;num<subset;num++){
            List<Integer> ans= new ArrayList<>();
            for(int j = 0 ; j < n ; j++){

                if((num &(1<<j))!=0){
                    ans.add(nums[j]);
                }

            }

            result.add(ans);

        }

        return result;
        
    }
}