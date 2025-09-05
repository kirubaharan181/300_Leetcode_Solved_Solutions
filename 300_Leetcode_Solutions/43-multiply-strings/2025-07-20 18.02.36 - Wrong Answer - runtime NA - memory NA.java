class Solution {
    public String multiply(String num1, String num2) {
        return String.valueOf(Math.abs(Long.parseLong(num1))*Math.abs(Long.parseLong(num2)));
    }
}