class Solution {
    public List<String> printVertically(String s) {
        List<String> l=new ArrayList<>();
        int c=0;
        String[] str=s.split(" ");

        for(String k:str)
        {
            c=Math.max(c,k.length());
        }   
        for(int i=0;i<c;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(String t:str)
            {
                sb.append(i<t.length()?t.charAt(i):' ');
            }
            l.add(sb.toString().stripTrailing());
        }
        return l;

    }
}