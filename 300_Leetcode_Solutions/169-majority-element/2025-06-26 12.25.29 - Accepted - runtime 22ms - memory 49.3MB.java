class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int k:nums)
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println("Value: " + entry.getKey() + " Count: " + entry.getValue());
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}