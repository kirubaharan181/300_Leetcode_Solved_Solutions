class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<str.length;k++)
        {
            String m=str[k];
        for(int i=m.length()-1;i>=0;i--)
        {
            sb.append(m.charAt(i));
        }
        sb.append(" ");
        }
        return sb.toString().trim();
    }
}