class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1,res;
        while(n>0)
        {
            int t=n%10;
            sum+=t;
            prod*=t;
            n/=10;
        }
        res=prod-sum;
        return res;
    }
}