import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for (int m:num) 
        {
            sb.append(m);
        }
        BigInteger a = new BigInteger(sb.toString());
        BigInteger sum = a.add(BigInteger.valueOf(k));
        String res = sum.toString();

        List<Integer> l = new ArrayList<>();
        for (int i=0; i<res.length(); i++) 
        {
            l.add(res.charAt(i) - '0');
        }
        return l;
    }
}