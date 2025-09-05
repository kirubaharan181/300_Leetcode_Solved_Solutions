class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        int res=0;
        for(int k: nums)
        {
            if(!st.add(k))
            {
                res=k;
            }
        }
        return res;
    }
}