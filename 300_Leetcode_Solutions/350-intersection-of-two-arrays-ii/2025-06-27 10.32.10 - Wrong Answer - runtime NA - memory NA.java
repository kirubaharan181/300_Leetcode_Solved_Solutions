class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        l1.retainAll(l2);
        
        int[] arr=new int[l1.size()];
        for(int i=0;i<l1.size();i++)
        {
            arr[i]=l1.get(i);
        }
        return arr;
    }
}