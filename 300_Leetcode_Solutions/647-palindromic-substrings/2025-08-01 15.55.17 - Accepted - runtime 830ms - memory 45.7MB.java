class Solution {
    public int countSubstrings(String s) {
        int c=s.length();
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++)
            {
                sb.append(s.charAt(j));
                if(isPal(sb.toString()))
                {
                    c++;
                }
            }
        }
        return c;
    }
    public boolean isPal(String k)
    {
        int i=0;
        int l=k.length()-1;
        while(i<l)
        {
            if(k.charAt(i++)!=k.charAt(l--))
            {
                return false;
            }
        }
        return true;
    }
}