class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        Set<Integer> s1 = new HashSet<>();
        for (int num : nums1) 
        {
            s1.add(num);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int num : nums2) 
        {
            s2.add(num);
        }

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int k:s1)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for(int k:s2)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        
        int min=Integer.MAX_VALUE,res=0;
        for(int key:hm.keySet())
        {
            if(hm.get(key)>1)
            {
                min=Math.min(min,key);
            }
        }
        return min;
    }
}