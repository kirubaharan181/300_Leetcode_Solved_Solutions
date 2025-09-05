class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
        {
            return false;
        }
        else
        {
            for(int i=0;i<words.size();i++)
            {
                String k=words.get(i);
                if(!k.startsWith(String.valueOf(s.charAt(i))))
                {
                    return false;
                }
            }
        }
        return true;
    }
}