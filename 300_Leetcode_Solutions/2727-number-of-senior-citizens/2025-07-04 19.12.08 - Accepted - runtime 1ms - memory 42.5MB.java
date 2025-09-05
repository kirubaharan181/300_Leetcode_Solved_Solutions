class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String k:details)
        {
            if(!Character.isDigit(k.charAt(10)))
            {
            int s1=k.charAt(11) - '0';
            int s2=k.charAt(12) - '0';
            int m=(s1*10)+s2;
            if(m>60)
            {
                c++;
            }
            }
        }
        return c;
    }
}