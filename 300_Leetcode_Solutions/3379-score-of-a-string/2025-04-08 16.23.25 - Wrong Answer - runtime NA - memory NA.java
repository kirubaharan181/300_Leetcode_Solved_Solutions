class Solution {
    public int scoreOfString(String s) {
        char[] str=s.toCharArray();
        
        int res=0;
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                int a1=(int) str[i];
                int a2=(int) str[j];
                res += Math.abs(a1 - a2);
            } 

        }
        return res;
    }
}

