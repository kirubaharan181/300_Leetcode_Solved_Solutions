class Solution {
    public boolean checkString(String s) {
        int k=s.lastIndexOf('a');
        int l=s.indexOf('b');
        return k==-1 || l==-1 || k<l ;
        
    }
}