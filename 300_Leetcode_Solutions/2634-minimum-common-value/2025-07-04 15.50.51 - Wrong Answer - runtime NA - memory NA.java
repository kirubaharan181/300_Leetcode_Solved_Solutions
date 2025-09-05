class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        List<Integer> l1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        l1.addAll(l2);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int k:l1)
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