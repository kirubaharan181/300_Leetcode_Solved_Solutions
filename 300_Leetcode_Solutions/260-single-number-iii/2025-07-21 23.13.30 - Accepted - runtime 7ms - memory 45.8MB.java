class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return nums;
        int[] res=new int[2];
        int i=0;
        Map<Integer,Integer> hm=new HashMap<>();

        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for(int key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
                res[i++]=key;
            }
        }
        return res;
    }
}