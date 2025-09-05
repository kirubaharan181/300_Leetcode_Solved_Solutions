class Solution {
    public boolean isPalindrome(String s) 
    {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        char[] res = str.toCharArray();
        int l = 0;
        int r = res.length - 1;

        while (l < r) 
        {
            if (res[l] != res[r]) 
            {
                return false; 
            }
            l++;
            r--;
        }
        return true; 
    }
}