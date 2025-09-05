class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String k: words)
        {
            if(s.startsWith(k))
            {
                c++;
            }
        }
        return c;
    }
}