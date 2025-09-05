class Solution
{
    public String thousandSeparator(int n)
    {
        String st = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int l = st.length(), c = 0;
        if (n < 1000)
        {
            return st;
        }
        else
        {
            for (int i = l - 1; i >= 0; i--)
            {
                if (c == 3)
                {
                    sb.append('.');
                    c = 0;
                }
                sb.append(st.charAt(i));
                c++;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}