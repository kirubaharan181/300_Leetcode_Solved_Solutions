class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        List<Integer> l1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        l1.retainAll(l2);
        Collections.sort(l1);
        return l1.get(0);
    }
}