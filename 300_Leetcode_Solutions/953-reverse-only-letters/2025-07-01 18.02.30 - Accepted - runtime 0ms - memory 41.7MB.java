class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j]))
            {
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=t;
                i++;j--;
            }
            else if(Character.isLetter(ch[i]))
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return new String(ch);
    }
}