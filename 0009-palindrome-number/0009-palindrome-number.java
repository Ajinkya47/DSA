class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;  // Negative numbers are not palindrome
        
        int original = x;
        int revNum = 0;
        
        while (x != 0) {
            int digit = x % 10;
            revNum = revNum * 10 + digit;
            x = x / 10;
        }
        
        return original == revNum;

        // if(x<0)return false;



    //     int num=palin(x);

    //     if(num==x){
    //         return true;
    //     }

    //     return false;
       
    // }
    // int reverse=0;
    // public int palin(int x){
    //     if(x<1) return 0;

        
    //     reverse=reverse*10+(x%10);

    //     palin(x/10);
    //     return reverse;
    // }
}
}