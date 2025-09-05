class Solution {
    public int balancedStringSplit(String s) {
        int cl=0,cr=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                cl++;
            }
            else
            {
                cr++;
            }
            if(cl==cr)
            {
                c++;
            }
        }
        
        return c;
    }
}