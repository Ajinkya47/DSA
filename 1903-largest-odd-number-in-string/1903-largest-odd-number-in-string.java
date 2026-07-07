class Solution {
    public String largestOddNumber(String num) {

        int endIndex =-1;
        int i;
        for(i = num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                endIndex=i;
                break;
            }

        }

            if(endIndex==-1) return "";

            i = 0;
            while(i<=endIndex && num.charAt(i)=='0'){
                i++;
            }
            
           


        

        return num.substring(i,endIndex+1);
        
    }
}