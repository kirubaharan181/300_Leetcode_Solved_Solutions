class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for(int key:hm.keySet())
        {
            if(hm.get(key)==2)
            {
                l.add(key);
            }
        }
        return l;
    }
}