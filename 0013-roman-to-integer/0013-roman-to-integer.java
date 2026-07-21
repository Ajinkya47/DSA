class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        int i = length - 1;
        
        while (i >= 0) {
            if (i > 0 && s.charAt(i) == 'V' && s.charAt(i-1) == 'I') {
                sum += 4;
                i -= 2;  
            }
            else if (i > 0 && s.charAt(i) == 'X' && s.charAt(i-1) == 'I') {
                sum += 9;
                i -= 2;
            }
            else if (i > 0 && s.charAt(i) == 'L' && s.charAt(i-1) == 'X') {
                sum += 40;
                i -= 2;
            }
            else if (i > 0 && s.charAt(i) == 'C' && s.charAt(i-1) == 'X') {
                sum += 90;
                i -= 2;
            }
            else if (i > 0 && s.charAt(i) == 'D' && s.charAt(i-1) == 'C') {
                sum += 400;
                i -= 2;
            }
            else if (i > 0 && s.charAt(i) == 'M' && s.charAt(i-1) == 'C') {
                sum += 900;
                i -= 2;
            }
            else {
                
                char c = s.charAt(i);
                if (c == 'I') sum += 1;
                else if (c == 'V') sum += 5;
                else if (c == 'X') sum += 10;
                else if (c == 'L') sum += 50;
                else if (c == 'C') sum += 100;
                else if (c == 'D') sum += 500;
                else if (c == 'M') sum += 1000;
                i--;
            }
        }
        
        return sum;
    }
}