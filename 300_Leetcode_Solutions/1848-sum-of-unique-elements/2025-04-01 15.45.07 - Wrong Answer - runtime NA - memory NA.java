class Solution {
    public int sumOfUnique(int[] nums) {
      HashSet<Integer> hp=new HashSet<>();
      for(int k:nums)
      {
        hp.add(k);
      }  
        int sum=0;
        for(int s:hp)
        {
            sum+=s;
        }
        return sum; 
    }
}