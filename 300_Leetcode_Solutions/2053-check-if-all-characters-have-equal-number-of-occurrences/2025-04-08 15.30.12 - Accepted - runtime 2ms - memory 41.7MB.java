class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] ch = s.toCharArray();

        int[] freq = new int[26];

        for (char k : ch) {
            freq[k - 'a']++;
        }
        int c=0;
        for(int ct:freq)
        {
            if(ct!=0)
            {
                if(c==0)
                {
                    c=ct;
                }
                else if(ct!=c)
                {
                    return false;
                }
            }
        }
        return true;
    }
}