class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        LinkedList <Integer> l =new LinkedList<>();
        for(int i=0;i<nums1.length;i++)
        {
        l.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
        l.add(nums2[i]);
        }
        Collections.sort(l);
        int k=l.size();
        if(k%2!=0)
        {
            int res=k/2;
            double m=l.get(res);
            return m;
        }
        else
        {
            int res1 = k / 2; 
            int a1 = l.get(res1 - 1); 
            int a2 = l.get(res1); 
            return (a1 + a2) / 2.0;
        }
    }
}