class Solution {
    public boolean isHappy(int n) {
        return spl(n, new boolean[1000]); 
    }

    public boolean spl(int n, boolean[] s) {
        if (n == 1) {
            return true; 
        }
        
        if (s[n]) {
            return false; 
        }
        
        s[n] = true; 
        
        int res = 0;
        for (char digit : Integer.toString(n).toCharArray()) {
            res += Math.pow(Character.getNumericValue(digit), 2);
        }
    
        return spl(res, s);
    }
}