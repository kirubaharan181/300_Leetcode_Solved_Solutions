class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0,j=s.length()-1;
        char[] ch=s.toCharArray();
        while(i<j)
        {
            if(ch[i]!=ch[j])
            {
                char k=(char) Math.min(ch[i],ch[j]);
                ch[i++]=k;
                ch[j--]=k;
            }
            else
            {
                i++;j--;
            }
        }
        return new String(ch);
    }
}