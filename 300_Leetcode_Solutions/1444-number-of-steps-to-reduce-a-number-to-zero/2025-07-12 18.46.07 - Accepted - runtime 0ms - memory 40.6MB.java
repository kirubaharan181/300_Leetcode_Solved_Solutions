class Solution {
    public int numberOfSteps(int num) {
       int c=0; 
       return Steps(num,c);
    }
    public int Steps(int num ,int c)
    {
        return num==0?c:num%2==0?Steps(num/2,c+1):Steps(num-1,c+1);
    }
}