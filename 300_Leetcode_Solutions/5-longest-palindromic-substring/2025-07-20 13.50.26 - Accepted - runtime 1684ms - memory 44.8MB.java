class Solution {
    public String longestPalindrome(String s) {
        int l=s.length();
        int max=0;
        String res="";
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                
                if(pal(s,i,j))
                {
                    int len=j-i+1;
                    if(len>max)
                    {
                        max=len;
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
        return s.length()==1?s:res.length()==0?String.valueOf(s.charAt(0)):res;
    }
    public Boolean pal(String s,int r,int l)
    {
        while(r<l)
        {
            if(s.charAt(r++)!=s.charAt(l--))
            {
                return false;
            }
        }
        return true;
    }
}