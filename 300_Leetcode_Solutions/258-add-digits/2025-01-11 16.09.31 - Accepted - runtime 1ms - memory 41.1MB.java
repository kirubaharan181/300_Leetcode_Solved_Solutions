class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            String numst = String.valueOf(num);
            for (int i = 0; i < numst.length(); i++) {
                sum += Character.getNumericValue(numst.charAt(i));
            }
            num = sum;
        }
        return num;
    }
}
