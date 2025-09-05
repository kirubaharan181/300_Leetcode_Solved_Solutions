class Solution
{
    public int findKthPositive(int[] arr, int k)
    {
        int c = 0 , res=0, j = 0 ;
        for (int i = 1 ; ; i++)
        {
            if (j < arr.length && i == arr[j])
            {
                j++ ;
            }
            else
            {
                c++ ;
                if (c == k)
                {
                    res = i ;
                    break ;
                }
            }
        }
        return res ;
    }
}