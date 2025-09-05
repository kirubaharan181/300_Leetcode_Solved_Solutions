class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int sum=0,max=0;
        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for(int key:hm.keySet())
        {
            if(hm.get(key)>max)
            {
                max=hm.get(key);
            }
        }
        int tot=0;
        for(int key:hm.keySet())
        {
            if(hm.get(key)==max)
            {
                tot+=hm.get(key);
            }
        }
        return tot;
    }
}