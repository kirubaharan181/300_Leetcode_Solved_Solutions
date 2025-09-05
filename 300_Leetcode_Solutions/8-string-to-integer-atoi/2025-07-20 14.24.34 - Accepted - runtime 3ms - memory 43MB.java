class Solution
{
    public int myAtoi(String s)
    {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int res = 0;
        boolean neg = false;
        boolean start = false;

        for (int i = 0; i < s.length(); i++)
        {
            char k = s.charAt(i);

            if (!start && (k == '-' || k == '+'))
            {
                neg = (k == '-');
                start = true;
            }
            else if (Character.isDigit(k))
            {
                sb.append(k);
                start = true;
            }
            else if (Character.isLetter(k) || k == ' ')
            {
                break;
            }
            else if (!start)
            {
                return 0;
            }
            else
            {
                break;
            }
        }

        if (sb.length() != 0)
        {
            try
            {
                res = Integer.parseInt(sb.toString());
            }
            catch (NumberFormatException e)
            {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }

        return neg ? res * -1 : res;
    }
}

