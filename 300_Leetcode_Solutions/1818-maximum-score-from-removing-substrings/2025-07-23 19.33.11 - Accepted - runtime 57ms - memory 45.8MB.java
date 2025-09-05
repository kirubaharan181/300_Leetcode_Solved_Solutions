class Solution {
    public int maximumGain(String s, int x, int y) {
        if (y > x)
        {
            String res1 = remBA(s);
            int c1 = ((s.length() - res1.length()) / 2) * y;
            String res2 = remAB(res1);
            int c2 = ((res1.length() - res2.length()) / 2) * x;
            return c1 + c2;
        }
        else
        {
            String res1 = remAB(s);
            int c1 = ((s.length() - res1.length()) / 2) * x;
            String res2 = remBA(res1);
            int c2 = ((res1.length() - res2.length()) / 2) * y;
            return c1 + c2;
        }
    }

    public String remBA(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
        {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == 'b' && c == 'a')
            {
                sb.setLength(len - 1);
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String remAB(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
        {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == 'a' && c == 'b')
            {
                sb.setLength(len - 1);
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}