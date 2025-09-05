class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        return x+y<=target?true:(x+y)/2 <= target ?true:false;
    }
}