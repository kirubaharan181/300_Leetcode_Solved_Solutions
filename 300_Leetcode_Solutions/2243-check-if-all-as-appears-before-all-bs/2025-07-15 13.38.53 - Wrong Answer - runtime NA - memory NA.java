class Solution {
    public boolean checkString(String s) {
        int k=s.lastIndexOf('a');
        return (!s.contains(String.valueOf('a')))?true:( k + 1 == s.length() || s.charAt(k + 1) != 'b' || (k > 0 && s.charAt(k - 1) != 'b'));
    }
}