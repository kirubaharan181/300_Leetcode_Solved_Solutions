class Solution {
    public int findIntegers(int n) {
        int c=0;
        for(int i=0;i<=n;i++)
        {
            if(bin(i))
            {
                c++;
            }
        }
        return c;
    }
    public boolean bin(int k)
    {
        String b=Integer.toBinaryString(k);
        if(b.contains("11"))
        {
            return false;
        }
        return true;
    }
}