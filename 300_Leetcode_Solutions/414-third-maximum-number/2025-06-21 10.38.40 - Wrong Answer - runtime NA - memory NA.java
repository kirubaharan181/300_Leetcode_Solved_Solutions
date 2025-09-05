class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int k : nums)
        {
            s.add(k);
        }
        List<Integer> l=new ArrayList<>(s);
        Collections.reverse(l);
        if(l.size()<3)
        {
            return Collections.max(l);
        }
        else
        {
            return l.get(2);
        }
        
    }
}