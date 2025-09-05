class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
        {
            ch[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) 
        {
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}