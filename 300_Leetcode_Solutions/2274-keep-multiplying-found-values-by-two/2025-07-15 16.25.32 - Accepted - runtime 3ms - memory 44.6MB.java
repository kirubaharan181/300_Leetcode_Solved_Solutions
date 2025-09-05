class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        boolean b=true;
        int k=0,res=0,s=original;
        while(b)
        {
            k=Arrays.binarySearch(nums,original);
            if(k>=0)
            {
                original*=2;
            }
            else
            {
                b=false;
            }
           
        }
        return nums.length==1 && nums[0]==original?s*2:original;
    }
}