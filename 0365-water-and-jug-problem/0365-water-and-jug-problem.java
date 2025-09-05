class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        return (x+y>=target) && (target ==0 || target % gcd (x,y)==0);
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}