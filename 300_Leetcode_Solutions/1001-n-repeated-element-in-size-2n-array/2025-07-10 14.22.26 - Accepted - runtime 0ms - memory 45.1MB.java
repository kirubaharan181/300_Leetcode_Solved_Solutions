class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int k:nums)
        {
            if(!st.add(k))
            {
                return k;
            }
        }
        return -1;
    }
}