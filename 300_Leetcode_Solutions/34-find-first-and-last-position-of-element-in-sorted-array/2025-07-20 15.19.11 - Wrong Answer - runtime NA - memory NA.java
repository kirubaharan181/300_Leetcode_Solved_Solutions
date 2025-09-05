class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1,k1=-1,k2=-1;
        int a=i;
        while(a<j)
        {
            if(nums[a]==target)
            {
                k1=a;
                break;
            }
            a++;
        }
        while(i<j)
        {
            if(nums[j]==target)
            {
                k2=j;
                break;
            }
            j--;
        }
        return new int[]{k1,k2};   
    }
}