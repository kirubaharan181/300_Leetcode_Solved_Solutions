class Solution {
    public int hammingDistance(int x, int y) {
        int c=x^y;
        int dist=0;
        while(c!=0)
        {
            dist+= c & 1;
            c>>=1;
        }
        return dist;
    }
}