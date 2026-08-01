class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();
        if(k==num.length()) return "0";

        for(char ch:num.toCharArray()){

            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }

            st.add(ch);
                       
        }
        while(k>0  && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder mystr= new StringBuilder();
        while(!st.isEmpty()){
            mystr.append(st.pop());
        }

        mystr.reverse();

        while (mystr.length() > 1 && mystr.charAt(0) == '0') {
            mystr.deleteCharAt(0);
        }

        return mystr.toString();


    }
}