class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        char[] chars=s.toCharArray();
        int n = chars.length;
        for(int i=0; i<n; i++){
            if(chars[i]=='*'){
                st.pop();
            }
            else{
            st.push(chars[i]);
            }
        }
        if(st.isEmpty()) return "";

        StringBuilder mystr= new StringBuilder();
    

        while(!st.isEmpty()){
            mystr.append(st.pop());

        }
        mystr.reverse();

        return mystr.toString();

        
    }
}