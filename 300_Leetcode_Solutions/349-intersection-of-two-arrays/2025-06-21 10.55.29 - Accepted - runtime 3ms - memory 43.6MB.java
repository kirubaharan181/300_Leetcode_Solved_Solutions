class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int i : nums1) 
        {
            s1.add(i);
        }

        Set<Integer> s2 = new HashSet<>();
        for(int j : nums2) 
        {
            s2.add(j);
        }

        s1.retainAll(s2);
        int[] res=new int[s1.size()];
        int i=0;
        for(int m : s1)
        {
            res[i++]=m;
        }
        return res;
    }
}