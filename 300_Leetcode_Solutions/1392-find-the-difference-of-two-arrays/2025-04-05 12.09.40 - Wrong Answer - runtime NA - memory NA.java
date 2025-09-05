class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> k1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> k2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        List<Integer> l1 = new ArrayList<>(k1);
        List<Integer> l2 = new ArrayList<>(k2);
        List<Integer> l3 = new ArrayList<>(k1);

        l1.removeAll(l2);
        l2.removeAll(l3);  
        List<List<Integer>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2); 
        return result;
    }

   
}