class Solution {
    public static int getCommon(int[] nums1, int[] nums2) {
        
    	HashSet<Integer> hs = new HashSet<Integer>();
    	for(int num1 :  nums1) 
        {
    		hs.add(num1);
    	}
    	
    	for(int num2 : nums2) 
        {
    		if(hs.contains(num2)) 
            {
    			return num2;
    		}
    	}
    	return -1;
    }
}