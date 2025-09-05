class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int t,rev=0,temp=x;
        if(x<0)
        {
            return false;
        }
        while(temp!=0)
        {
        t=temp%10;
        rev = rev*10 + t;
        temp/=10;
        }
            return (rev==x);
        
    }
    
}