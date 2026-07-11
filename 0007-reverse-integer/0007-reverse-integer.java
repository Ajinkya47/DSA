class Solution {
    public static int reverse(int x) {
        long revNum = 0;
        
        while (x != 0) {
            int digit = x % 10;
            revNum = revNum * 10 + digit;
            x = x / 10;
        }
        
        if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) revNum;
    }
    
    public static void main(String[] args) {
        int x = 12345;
        System.out.println(reverse(x));
    }
}