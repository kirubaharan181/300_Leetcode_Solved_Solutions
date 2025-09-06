class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int k:nums)
        {
            st.add(k);
            String str=String.valueOf(k);
            String t=new StringBuilder(str).reverse().toString();
            st.add(Integer.parseInt(t));
        }
        return st.size();
    }
}