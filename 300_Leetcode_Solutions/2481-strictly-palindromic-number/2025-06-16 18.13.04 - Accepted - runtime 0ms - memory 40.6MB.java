class Solution {
    public boolean isStrictlyPalindromic(int n) {
        Boolean res = true;
        for (int i = 2; i < n - 1; i++) 
        {
            String cn = Integer.toString(n, i);
            res = pal(cn);
            if (res == false) 
            {
                return false;
            }
        }
        return true;
    }

    public boolean pal(String cn) 
    {
        int l = cn.length();
        Boolean b = true;
        int i = 0;
        while (i < Math.round(l / 2.0)) 
        {
            if (cn.charAt(i) != cn.charAt(l - 1 - i)) 
            {
                b = false;
                break;
            }
            i++;
        }
        return b;
    }
}
