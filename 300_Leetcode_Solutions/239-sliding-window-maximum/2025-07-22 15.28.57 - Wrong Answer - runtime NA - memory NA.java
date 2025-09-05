class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==1 || k==1) return nums;
        List<Integer> l=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            max=Math.max(max,Math.max(nums[i],Math.max(nums[i+1],nums[i+2])));
            l.add(max);
        }
        int[] res=new int[l.size()];
        int j=0;
        for(int k1:l)
        {
            res[j++]=k1;
        }
        return res;
    }
}