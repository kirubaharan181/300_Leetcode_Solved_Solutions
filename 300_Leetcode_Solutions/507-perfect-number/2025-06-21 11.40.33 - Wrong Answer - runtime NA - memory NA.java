class Solution {
    public boolean checkPerfectNumber(int num) {
        int res=1;
        for(int i=2;i<=(int)num/2;i++)
        {
            if(num%i==0)
            {
                res+=i;
            }
        }
        return res==num?true:false;
    }
}