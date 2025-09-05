class Solution {
    public double minimumAverage(int[] nums) {
       Arrays.sort(nums);
       int l=nums.length;
       Double[] res=new Double[l/2];
       int j=l-1;
       for(int i=0;i<l/2;i++)
       {
            res[i]=(nums[i]+nums[j--])/2.0;
       } 
       Arrays.sort(res);
       return res[0];
    }
}