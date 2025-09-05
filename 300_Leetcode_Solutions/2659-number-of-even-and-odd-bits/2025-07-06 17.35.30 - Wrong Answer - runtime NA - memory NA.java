class Solution {
    public int[] evenOddBit(int n) {
        int s1=0,s2=0;
        String str=Integer.toBinaryString(n);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1' )
            {
                if(i%2==0)
                {
                    s1++;
                }
                else
                {
                    s2++;
                }
            }
        }
        return new int[]{s2,s1};
    }
}