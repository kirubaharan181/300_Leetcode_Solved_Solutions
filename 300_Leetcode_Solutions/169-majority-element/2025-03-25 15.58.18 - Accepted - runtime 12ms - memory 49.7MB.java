class Solution {
    public int majorityElement(int[] nums) {
      int l=nums.length/2;
      Map<Integer,Integer>hp=new HashMap<>();
      for(int n:nums)
      {
        hp.put(n,hp.getOrDefault(n,0)+1); 
      } 
      for(int n:nums)
      {

      if(hp.get(n)>l)
        {
            return n;
        } 
      }
      return -1;
      
    }
}