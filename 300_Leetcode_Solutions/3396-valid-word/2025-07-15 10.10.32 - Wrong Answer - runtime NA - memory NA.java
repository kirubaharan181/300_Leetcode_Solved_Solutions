class Solution {
    public boolean isValid(String word) {
        int c=0,v=0,cn=0,d=0;
        if(word.length()<3)
        {
            return false;
        }
        else
        {
            for(char k:word.toCharArray())
            {
                int a=(int)k;
                if(a>=97 && a<=122 || a>=65 && a<=90)
                {
                    if("aeiouAEIOU".contains(String.valueOf(k)) )
                    {
                        v++;
                    }
                    else
                    {
                        cn++;
                    }
                    c++;
                }
                else
                {
                    d++;
                }
            }
        }
        if(c>2 && v>=1 && cn>=1)
        {
            return true;
        }
        return false;
    }
}