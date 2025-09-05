import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> l=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int k:digits)
        {
            sb.append(String.valueOf(k));
        }
        BigInteger big = new BigInteger(sb.toString());
        big = big.add(BigInteger.ONE);
        String res = big.toString();
        int[] arr=new int[res.length()];
        for(int i=0;i<res.length();i++)
        {
            arr[i]=res.charAt(i) - '0';
        }
        return arr;
    }
}