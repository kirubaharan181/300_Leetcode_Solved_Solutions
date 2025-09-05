class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String k=Integer.toBinaryString(n);
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i)=='1')
            {
                c++;
            }
        }
        return c;
    }
}