class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split(" ");
        int c=0;
        for(int i=0;i<str.length;i++)
        {
            String k=str[i];
            boolean b=false;
            for(int j=0;j<brokenLetters.length();j++)
            {
                if(k.contains(String.valueOf(brokenLetters.charAt(j))))
                {
                    b=true;
                    break;
                }
            }
            if(!b)
            {
                c++;
            }
        }
        return c;
    }
}