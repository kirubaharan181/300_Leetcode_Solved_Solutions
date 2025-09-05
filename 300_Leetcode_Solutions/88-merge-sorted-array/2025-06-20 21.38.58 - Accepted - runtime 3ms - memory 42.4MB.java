class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] s = IntStream.concat(Arrays.stream(nums1, 0, m), Arrays.stream(nums2)).toArray();
        Arrays.sort(s);
        for(int i = 0; i < s.length; i++) 
        {
            nums1[i] = s[i];
        }
    }
}