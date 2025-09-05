public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        while (s.length() < 32) 
        {
            s = "0" + s;
        }
        String sb=new StringBuilder(s).reverse().toString();
        long res=Long.parseLong(sb,2);
        return (int) res;
    }
}