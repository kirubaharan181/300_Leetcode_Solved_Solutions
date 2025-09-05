class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(i));
            max=Math.max(max,sb.length());

            for(int j=i+1;j<s.length();j++)
            {
                char ch2=s.charAt(j);
                if(!sb.toString().contains(String.valueOf(ch2)))
                {
                    sb.append(ch2);
                    max=Math.max(max,sb.length());
                }
                else
                {               
                    break;
                }
            }
        }
        return max;
    }
}