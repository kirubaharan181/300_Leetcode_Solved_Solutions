class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0,l=arr.length;
        for (int i = 0; i < l; i++) 
        {
            for (int j = 1; i + j <= l; j += 2) 
            {
                res += Sum(arr, i, i + j - 1);
            }
        }
        return res;
    }
    public int Sum(int[] arr ,int k, int i)
    {
        int sum=0;
        for(int j=k;j<=i;j++)
        {
            sum+=arr[j];
        }
        return sum;

    }
}