class Solution {
    public int maxPower(String s) {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                    res=Math.max(res,c);
                }
                else
                {
                    break;
                }
            }
        }
        return res+1;
    }
}