class Solution {
    public String largestOddNumber(String num) {
        int t=Integer.parseInt(num);
        if(t%2==1)
        {
            return num;
        }
        int res=0;
        for(char k:num.toCharArray())
        {
            int c=k -'0';
            if(c%2==1)
            {
                res=Math.max(res,c);
            }
        }
        return res==0?"":String.valueOf(res);
    }
}