class Solution {
    public int search(int[] nums, int target) {
        List<Integer> l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        int res=Collections.binarySearch(l,target);
        return nums[0]==target?0:res>0?res:-1;
    }
}