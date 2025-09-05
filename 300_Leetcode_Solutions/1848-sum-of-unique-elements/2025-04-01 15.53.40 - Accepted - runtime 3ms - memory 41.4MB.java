class Solution {
    public int sumOfUnique(int[] nums) {
      HashMap<Integer, Integer> hp = new HashMap<>();
        
        for (int k : nums) 
        {
            hp.put(k, hp.getOrDefault(k, 0) + 1);
        }
        
        ArrayList<Integer> s = new ArrayList<>();
        
        for (HashMap.Entry<Integer, Integer> entry : hp.entrySet()) 
        {
            if (entry.getValue() == 1) 
            {
                s.add(entry.getKey());
            }
        } 
        int sum=0;
        for(int res:s)
        {
            sum+=res;
        }
        return sum;
    }
}