class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l1=s.length();
        int l2=p.length();
        List<Integer> l=new ArrayList<>();
        char[] p1=p.toCharArray(); 
        Arrays.sort(p1);
        for(int i=0;i<=l1-l2;i++)
        {
            String t=s.substring(i,i+l2);
            if(Anagram(t,p1))
            {
                l.add(i);
            }
        }
        return l;
    }
    public boolean Anagram(String k,char[] p1)
    {
        char[] k1=k.toCharArray(); 
        Arrays.sort(k1);
        if(Arrays.equals(k1,p1))
        {
            return true;
        }
        return false;
    }
}