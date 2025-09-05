class Solution {
    public boolean isPalindrome(int x) {
        if(x<11)
        {
            return false;
        }
        int l=(int)Math.floor(Math.log10(x)+1);
        int i=0;
        String str=String.valueOf(x);
        boolean b=false;
        while(i<l)
        {
            if(str.charAt(i)!=str.charAt(--l))
            {
                b=false;
            }
            else
            {
                b=true;
               
            }
        }
        return b;
    }
}