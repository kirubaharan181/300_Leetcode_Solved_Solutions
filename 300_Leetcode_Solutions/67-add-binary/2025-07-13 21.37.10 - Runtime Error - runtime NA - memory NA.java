class Solution {
    public String addBinary(String a, String b) {
       int n1=Integer.parseInt(a,2);
       int n2=Integer.parseInt(b,2);
       return Integer.toBinaryString(n1+n2); 
    }
}