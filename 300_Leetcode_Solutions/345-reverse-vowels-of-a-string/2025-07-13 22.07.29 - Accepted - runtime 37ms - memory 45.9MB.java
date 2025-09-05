class Solution
{
    public String reverseVowels(String s)
    {
        String v = "aeiouAEIOU";
        StringBuilder b = new StringBuilder(s);
        StringBuilder vs = new StringBuilder();
        for (char c : s.toCharArray())
        {
            if (v.contains(String.valueOf(c)))
            {
                vs.append(c);
            }
        }
        vs.reverse();
        int vi = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (v.contains(String.valueOf(s.charAt(i))))
            {
                b.replace(i, i + 1, String.valueOf(vs.charAt(vi)));
                vi++;
            }
        }
        return b.toString();
    }
}