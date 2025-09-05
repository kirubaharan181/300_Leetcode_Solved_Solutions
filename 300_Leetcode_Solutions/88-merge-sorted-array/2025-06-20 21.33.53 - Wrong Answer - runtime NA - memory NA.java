class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] s = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(s);
        int i=0;
        for(int k : s)
        {
            if(k!=0)
            {
                nums1[i]=k;
                i++;
            }
        }
    }
}