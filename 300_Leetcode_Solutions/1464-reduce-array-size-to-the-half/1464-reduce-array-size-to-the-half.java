class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> hm=new HashMap<>();
        int l=arr.length;
        int t=arr.length/2;
        List<Integer> l1=new ArrayList<>();
        int c=0;
        
        for(int k:arr)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        
        for(int key:hm.keySet())
        {
            l1.add(hm.get(key));
        }
        Collections.sort(l1);
        
        for(int i=l1.size()-1;i>=0;i--)
        {
            l-=l1.get(i);
            c++;
            if(l<=t)
            {
                return c;
            }
        }
        return 0;   
    }
}