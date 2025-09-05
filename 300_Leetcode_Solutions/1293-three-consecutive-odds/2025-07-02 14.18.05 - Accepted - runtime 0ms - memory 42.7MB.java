class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean b=false;
        if(arr.length<3)
        {
            return b;
        }
        for(int i=0;i<=arr.length-3;i++)
        {
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1)
            {
                b=true;
                break;
            }
        }
        
        return b;
    }
}