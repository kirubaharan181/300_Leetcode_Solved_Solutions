class Solution {
    public int secondHighest(String s) {
        Set<Integer> l=new TreeSet<>();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                l.add(c-'0');
            }
        }
        List<Integer> l1 = new ArrayList<>(l);
        return l.size()<2?-1:l1.get(l1.size()-2);
    }
}