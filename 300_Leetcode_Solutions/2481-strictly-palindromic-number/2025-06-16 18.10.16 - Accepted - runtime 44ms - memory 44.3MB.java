class Solution {
    public boolean isStrictlyPalindromic(int n) {
        Boolean res=false;
        for(int i=2;i<=n;i++)
        {
            String cn=Integer.toString(n,i);
            res=pal(cn);
        }
        return res;
    }
    public boolean pal(String cn)
    {
        int l=cn.length();
        Boolean b=true;
        int i=0;
        while(i<Math.round(l/2.0))
        {
            if(cn.charAt(i)!=cn.charAt(l-1))
            {
                b=false;
            }
            i++;
        }
        return b;
    }
}