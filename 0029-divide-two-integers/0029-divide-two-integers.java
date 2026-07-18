class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        if(divisor==1) return dividend;

        boolean isPositive=true;
        if(dividend>=0 && divisor<0) isPositive= false;
        if(dividend<0 && divisor>0)  isPositive= false;

        long ans=0;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);

        while(n>=d){
            int count=0;
            while(n >= (d << (count+1))){
                count++;
            }
            n -= d * (1 << count);
            ans += (1 << count);
        }

        if (ans > Integer.MAX_VALUE && isPositive) 
            return Integer.MAX_VALUE;
        if (ans > Integer.MAX_VALUE && !isPositive)
            return Integer.MIN_VALUE;
        
        return isPositive ? (int)ans : (int)(-ans);
    }
}