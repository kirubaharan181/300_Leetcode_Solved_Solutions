class Solution {
    public String addBinary(String a, String b) {
       Long n1=Long.parseLong(a,2);
       Long n2=Long.parseLong(b,2);
       return Long.toBinaryString(n1+n2); 
    }
}