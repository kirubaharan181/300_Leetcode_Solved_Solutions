class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String k: words)
        {
            if(k.startsWith(pref))
            {
                c++;
            }
        }
        return c;
    }
}