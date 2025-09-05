class Solution {
    public String longestPalindrome(String s) {
        int l=s.length()-1;
        int max=0;
        String res="";
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l+1;j++)
            {
                String k=s.substring(i,j+1);
                if(pal(k))
                {
                    if(k.length()>max)
                    {
                        max=k.length();
                        res=k;
                    }
                }
            }
        }
        return res;
    }
    public Boolean pal(String k)
    {
        StringBuilder sb=new StringBuilder(k);
        String str=sb.reverse().toString();
        return str.equals(k);
    }
}