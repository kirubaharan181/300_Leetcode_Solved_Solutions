class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int c=0;
        String str=magazine;
        for(int i=0;i<ransomNote.length();i++)
        {
            StringBuilder sb=new StringBuilder(str);
            str=sb.toString();
            if(str.contains(String.valueOf(ransomNote.charAt(i))))
            {
                c++;
                sb.deleteCharAt(sb.indexOf(String.valueOf(ransomNote.charAt(i))));
                str=sb.toString();
            }
            if(c==ransomNote.length())
            {
                return true;
            }
        }
        return false;
    }
}