class Solution {
    public int maxDepth(String s) {
        int level=0;
        int depth = 0;
        for(int i =0;i<s.length()-1;i++){

            if(s.charAt(i)=='('){
                level++;
                depth=Math.max(depth,level);
            }

            else if(s.charAt(i)==')'){
                level--;
            }

            
        }

        return depth;
        
    }
}