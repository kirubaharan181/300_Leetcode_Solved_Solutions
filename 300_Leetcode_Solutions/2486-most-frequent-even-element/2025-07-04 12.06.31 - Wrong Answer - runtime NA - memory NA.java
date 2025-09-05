class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int max=0,res=0;
        for(int key:hm.keySet())
        {
            if(key%2==0)
            {
            if(hm.get(key)>max)
            {
                max=hm.get(key);
                res=key;
            }
            }
        }
        return res==0?-1:res;
    }
}