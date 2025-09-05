class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for(String k: words)
        {
            StringBuilder sb=new StringBuilder(k);
            String str=sb.reverse().toString();
            if(k.equals(str))
            {
                res=k;
                break;
            }
        }
        return res;
    }
}