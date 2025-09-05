class Solution {
    public boolean checkPerfectNumber(int num) {
        int res=1;
        if(num==1)
        {
            return false;
        }
        else
        {
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
}