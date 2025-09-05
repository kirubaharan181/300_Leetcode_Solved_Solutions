class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> l1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        l1.retainAll(l2);

        int[] res=new int[l1.size()];
        int i=0;
        for(int k:l1)
        {
            res[i++]=k;
        }

        return res;
    }
}