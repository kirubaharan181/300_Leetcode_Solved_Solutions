class Solution {
    public int superPow(int a, int[] b) {
        StringBuilder sb = new StringBuilder();
        for (int k: b) 
        {
            sb.append(k);
        }
        long exp = Long.parseLong(sb.toString());
        long res = 1;
        for (long i=0; i<exp; i++) {
            res = (res * a) % 1337;
        }
        return (int) res;
    }
}