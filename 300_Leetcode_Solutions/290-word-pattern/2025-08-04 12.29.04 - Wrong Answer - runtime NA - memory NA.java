class Solution {
    public boolean wordPattern(String pattern, String s) {
        Set<Character> s1=new HashSet<>();
        Set<String> s2=new HashSet<>();
        String[] k=s.split(" ");
        if (k.length != pattern.length()) return false;
        for(char t1:pattern.toCharArray())
        {
            s1.add(t1);
        }
        for(String t2:k)
        {
            s2.add(t2);
        }
        if(s1.size()==s2.size())
        {
            return true;
        }
        return false;

    }
}