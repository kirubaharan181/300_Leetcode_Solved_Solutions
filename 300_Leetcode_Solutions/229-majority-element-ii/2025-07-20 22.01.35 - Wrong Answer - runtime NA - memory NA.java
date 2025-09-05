class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int k: nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int max=Collections.max(hm.values());
        for(int key:hm.keySet())
        {
            if(hm.get(key)>=max)
            {
                max=hm.get(key);
                l.add(key);
            }
        }
        return l;
    }
}