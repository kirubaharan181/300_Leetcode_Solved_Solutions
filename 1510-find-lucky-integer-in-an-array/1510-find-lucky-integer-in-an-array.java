class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(arr);
        for(int k:arr)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int max=-1;
        for(int key:hm.keySet())
        {
            if(key==hm.get(key))
            {
                max=Math.max(max,hm.get(key));
            }   
        }
        if(Arrays.binarySearch(arr,max)!=-1)
        {
            return max;
        }
        return -1;
        
    }
}