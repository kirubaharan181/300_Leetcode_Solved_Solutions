class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String k:operations)
        {
            if(k.contains("+"))
            {
                x++;
            }
            else
            {
                --x;
            }
        }
        return x;
    }
}