class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        int max = -1;
        int min = Integer.MAX_VALUE;
        int l = 0;
        String m = "0";
        for (String k : nums)
        {
            int n = Integer.parseInt(k, 2);
            l = k.length();
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        for (int i = min + 1; i <= Math.pow(2, l) - 1; i++)
        {
            String t = Integer.toBinaryString(i);
            while (t.length() < l)
            {
                t = "0" + t;
            }
            boolean found = false;
            for (String k : nums)
            {
                if (k.equals(t))
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                return t;
            }
        }
        String ans = "";
        for (int i = 0; i < l; i++)
        {
            ans += m;
        }
        return ans;
    }
}