class Solution
{
    public String replaceDigits(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length();i++)
        {
            char k=s.charAt(i);
            if (!Character.isDigit(k))
            {
                sb.append(k);
            }
            else
            {
                char p =s.charAt(i - 1);
                int m = k-'0';
                sb.append((char)(p+m));
            }
        }
        return sb.toString();
    }
}