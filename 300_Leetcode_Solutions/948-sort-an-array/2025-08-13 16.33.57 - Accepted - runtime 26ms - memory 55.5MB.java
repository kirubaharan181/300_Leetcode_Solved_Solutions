class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) return nums;
        int mid=nums.length/2;
        int[] l=Arrays.copyOfRange(nums,0,mid);
        int[] r=Arrays.copyOfRange(nums,mid,nums.length);
        sortArray(l);
        sortArray(r);
        merge(l,r,nums);
        return nums;
    }
    public void merge(int[] l,int[]r,int[] res)
    {
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length)
        {
            res[k++]=(l[i]<=r[j])?l[i++]:r[j++];
        }
        while(i<l.length)
        {
            res[k++]=l[i++];
        }
        while(j<r.length)
        {
            res[k++]=r[j++];
        }
    }
}