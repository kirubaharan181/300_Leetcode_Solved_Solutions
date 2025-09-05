class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        return new int[]{l.indexOf(target),l.lastIndexOf(target)};   
    }
}