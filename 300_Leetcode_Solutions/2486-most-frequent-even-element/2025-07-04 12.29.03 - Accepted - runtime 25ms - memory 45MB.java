class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int max=0,res=-1;
        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for (int key : hm.keySet()) 
        {
            if (key % 2 == 0) 
            {
                int freq = hm.get(key);
                if (freq > max || (freq == max && key < res)) 
                {
                    max = freq;
                    res = key;
                }
            }
        }
        return res;
    }
}