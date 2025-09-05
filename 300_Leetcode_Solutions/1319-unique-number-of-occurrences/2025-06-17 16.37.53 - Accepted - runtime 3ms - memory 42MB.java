class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:arr)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int key:m.keySet())
        {
            l.add(m.get(key));
        }
        Set<Integer> set = new HashSet<>();
        for (int val : l) 
        {
            if (set.contains(val)) 
            {
                return false;
            }
            set.add(val);
        }
        return true;
    }
}