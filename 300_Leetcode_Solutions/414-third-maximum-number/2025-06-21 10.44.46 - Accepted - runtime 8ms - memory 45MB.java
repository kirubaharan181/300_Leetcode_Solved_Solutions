class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new TreeSet<>(Collections.reverseOrder());
        for(int k : nums)
        {
            s.add(k);
        }
        List<Integer> l=new ArrayList<>(s);
        if(l.size()<3)
        {
            return l.get(0);
        }
        else
        {
            return l.get(2);
        }
        
    }
}