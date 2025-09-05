class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;   
        for(int k:hours)
        {
            if(k>=target)
            {
                c++;
            }
        }
        return c;
    }
}