class Solution {
    public int search(int[] nums, int target) {
        List<Integer> l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        int res=Collections.binarySearch(l,target);
        return res>0?res:-1;
    }
}