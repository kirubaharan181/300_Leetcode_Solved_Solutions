class Solution {
    public boolean canConstruct(String r, String m) {
        int[] res=new int[26];
        for(char k1: r.toCharArray())
        {
            res[k1 - 'a']++;
        }
        for(char k2: m.toCharArray())
        {
            res[k2 - 'a']--;
        }
        for(int s:res)
        {
            if(s>0)
            {
                return false;
            }
        }
        return true;
    }
}