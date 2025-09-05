class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int res=0;
        for(int key:hm.keySet())
        {
            if(hm.get(key)%2==1)
            {
                res=key;
            }
        }
        return res;
    }
}