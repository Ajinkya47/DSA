class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;



        for(int i = 0;i<n ;i++){

            if(count1==0  && ele2!=nums[i]){
                ele1 = nums[i];
                count1+=1;


            }
            else if(count2==0 && ele1!=nums[i]){
                ele2 = nums[i];
                count2+=1;
            }

            else if(ele1 ==nums[i]){
                count1++;
            }
            else if (ele2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2 =0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(nums[i]==ele1){
                count1++;
            }
            if(nums[i]==ele2){
                count2++;
            }

        }

        int mini = n/3;
        if(count1>mini){
            result.add(ele1);
        }
        if(count2>mini && ele1!=ele2){
            result.add(ele2);
        }

        return result;
        
    }
}