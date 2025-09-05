class Solution {
    public String reversePrefix(String word, char ch) {
        int t=word.indexOf(ch);
        StringBuilder sb=new StringBuilder();
        for(int i=t;i>=0;i--)
        {
            sb.append(word.charAt(i));
        }
        for(int j=t+1;j<word.length();j++)
        {
            sb.append(word.charAt(j));
        }
        return sb.toString();
    }
}