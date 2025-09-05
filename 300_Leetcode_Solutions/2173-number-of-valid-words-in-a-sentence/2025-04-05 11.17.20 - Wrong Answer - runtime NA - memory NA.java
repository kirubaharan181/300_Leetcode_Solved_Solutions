class Solution {
    public int countValidWords(String sentence) 
    {
        String[] words=sentence.split("\\s+");
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            if (words[i].matches("[a-zA-Z]+"))
            {
                c++;
            }
        }
        return c;
    }
}