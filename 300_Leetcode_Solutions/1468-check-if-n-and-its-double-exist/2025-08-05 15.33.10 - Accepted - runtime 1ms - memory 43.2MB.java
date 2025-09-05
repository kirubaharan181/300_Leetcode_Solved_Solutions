class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int k=2*arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(k==arr[j] && i!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }
}