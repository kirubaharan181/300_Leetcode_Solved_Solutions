class Solution {
    public int[] countBits(int n) {
       int[] res=new int[n+1];
       for(int i=0;i<=n;i++)
       {
        int c=0;
        String b=Integer.toBinaryString(i);
        for(char k:b.toCharArray())
        {
            if(k=='1')
            {
                c++;
            }
        }
        res[i]=c;
       } 
       return res;
    }
}