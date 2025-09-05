class Solution {
    public int findClosest(int x, int y, int z) {
        int s1 = Math.abs(x - z);
        int s2 = Math.abs(y - z); 
        return s1<s2?1:s2<s1?2:0;            
    }
}