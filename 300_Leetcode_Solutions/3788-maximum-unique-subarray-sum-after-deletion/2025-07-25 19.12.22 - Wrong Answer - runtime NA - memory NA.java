class Solution {
    public int maxSum(int[] nums) {
        if(nums.length==1) return nums[0];
        Set<Integer> st=new LinkedHashSet<>();
        for(int k:nums)
        {
            st.add(k);
        }
        List<Integer> l=new ArrayList<>();
        for(int m:st)
        {
            l.add(m);
        }
        int sum=0,max=0;
        for(int i=0;i<st.size();i++)
        {
            sum=l.get(i);
            for(int j=i+1;j<st.size();j++)
            {
                if(l.get(i)>0 && l.get(j)>0)
                {
                    sum+=l.get(j);
                }
                else
                {
                    break;
                }
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}