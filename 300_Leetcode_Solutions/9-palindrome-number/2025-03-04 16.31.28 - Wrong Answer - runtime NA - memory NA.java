class Solution {
    public boolean isPalindrome(int x) {
        boolean b=false;
        int l=(int)Math.floor(Math.log10(x)+1);
        int i=0;
        String str=String.valueOf(x);

        if(x<0 || x==10)
        {
            b=false;
        }
        else if(x==0)
        {
            b=true;
        }
        else
        {
        while(i<l/2)
        {
            if(str.charAt(i)!=str.charAt(--l))
            {
                b=false;
            }
            else
            {
                b=true;
                i++;
               
            }
        }
        }
        return b;
    }
}