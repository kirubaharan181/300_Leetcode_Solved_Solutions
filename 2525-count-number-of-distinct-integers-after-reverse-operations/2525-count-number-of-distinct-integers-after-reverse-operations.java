class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int k:nums)
        {
            st.add(k);
            st.add(Rev(k));
        }
        return st.size();
    }
    public int Rev(int k)
    {
        int t=0;
        while(k>0)
        {
            t=t*10+(k%10);
            k/=10;
        }
        return t;
    }
}