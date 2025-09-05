class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb=new StringBuilder();
        int max=0;
        for(char k:s.toCharArray())
        {
            if(sb.length()==0)
            {
                sb.append(k);
            }
            else if(!sb.toString().contains(String.valueOf(k)))
            {
                sb.append(k);
            }
            else
            {
                max=Math.max(max,sb.length());
                sb.setLength(0);
                sb.append(k);
            }
        }
        return max;
    }
}