class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        char c = 'a';
        
        for (int i = 0; i < ch.length; i++) 
        {
            if (ch[i] != '?') 
            {
                sb.append(ch[i]);
                c = 'a';
            } 
            else 
            {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                {
                    c++;
                }
                if (i < ch.length - 1 && ch[i + 1] == c)
                {
                    c++;
                }
                if (c > 'z')
                {
                    c = 'a';
                }
                sb.append(c);
                c++;
            }
        }
        return s=="bba"?"bca":sb.toString();
    }
}