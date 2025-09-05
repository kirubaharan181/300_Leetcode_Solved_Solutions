class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int k : nums) 
        {
            hm.put(k, hm.getOrDefault(k, 0) + 1);
        }

        int t=nums.length / 3;

        for (int key:hm.keySet()) 
        {
            if (hm.get(key)>t) 
            {
                l.add(key);
            }
        }

        return l;
    }
}
