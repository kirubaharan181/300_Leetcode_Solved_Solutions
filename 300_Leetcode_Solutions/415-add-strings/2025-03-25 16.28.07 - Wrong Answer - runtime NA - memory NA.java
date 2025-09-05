class Solution {
    public String addStrings(String num1, String num2) {
        long s1=Long.parseLong(num1) + Long.parseLong(num2);
        return String.valueOf(s1);
    }
}