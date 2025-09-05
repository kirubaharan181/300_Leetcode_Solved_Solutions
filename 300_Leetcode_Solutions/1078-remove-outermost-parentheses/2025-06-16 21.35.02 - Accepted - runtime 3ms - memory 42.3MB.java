class Solution {
    public String removeOuterParentheses(String s) {
        
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            if (ch[i] == '(') {
                count++;
                if (count > 1) 
                {
                    sb.append(ch[i]);
                }
            } else {
                count--;
                if (count > 0) 
                { 
                    sb.append(ch[i]);
                }
            }
        }
        return sb.toString();
    }
}