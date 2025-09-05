class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int res=0;
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].startsWith(searchWord))
            {
                res=i+1;
                break;
            }
        }
        return res<1?-1:res;
    }
}