class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length-1;i+=2)
        {
            res[k++]=nums[i+1];
            res[k++]=nums[i];
        }
        return res;
    }
}