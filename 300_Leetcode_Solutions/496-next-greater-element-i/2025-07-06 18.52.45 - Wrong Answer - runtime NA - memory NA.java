class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            int k=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] )
                {
                    if(j<nums2.length-1 && nums2[j+1]>nums2[j])
                    {
                        k=nums2[j+1];
                    }
                }
            }
            if(k==0)
            {
                l1.add(-1);
            }
            else
            {
                l1.add(k);
            }

        }
        int[] res=l1.stream().mapToInt(Integer::intValue).toArray();
        return res;   
    }
}