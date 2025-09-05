class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        boolean b=true;
        int k=0,res=0;
        while(b)
        {
            k=Arrays.binarySearch(nums,original);
            System.out.println("K : "+k);
            if(k>0)
            {
                original*=2;
            }
            else
            {
                b=false;
            }
           
        }
        return original;
    }
}