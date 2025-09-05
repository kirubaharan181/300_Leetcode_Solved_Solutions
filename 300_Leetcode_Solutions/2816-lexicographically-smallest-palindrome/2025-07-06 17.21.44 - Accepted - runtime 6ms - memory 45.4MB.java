class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0,j=s.length()-1;
        char[] ch=s.toCharArray();
        while(i<j)
        {
            if(ch[i]!=ch[j])
            {
                if(ch[i]<ch[j])
                {
                    ch[j]=ch[i];
                    i++;
                    j--;
                }
                else 
                {
                    ch[i]=ch[j];
                    i++;j--;
                }
            }
            else
            {
                i++;j--;
            }
        }
        return new String(ch);
    }
}