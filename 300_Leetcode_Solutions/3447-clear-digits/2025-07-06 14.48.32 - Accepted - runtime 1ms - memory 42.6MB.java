class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int j=-1;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z')
            {
                j++;
                sb.append(ch);
            }
            else
            {
                if(j>=0)
                {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
       return sb.toString();
    }
}