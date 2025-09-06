class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1)
            {
                l.add(ch);
            }
        }
        Collections.sort(l);
        if(l.isEmpty()) return s;

        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            if("aeiouAEIOU".indexOf(ch1)!=-1)
            {
                sb.append(l.get(k++));
            }
            else
            {
                sb.append(ch1);
            }
        }
        return sb.toString();
    }
}