class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        String ans = "";
        for (int i = 0; i < num.length() - 2; i++) 
        {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) 
            {
                StringBuilder sb = new StringBuilder();
                sb.append(num.charAt(i)).append(num.charAt(i + 1)).append(num.charAt(i + 2));
                String s = sb.toString();
                int k = Integer.parseInt(s);
                if (k > max) {
                    max = k;
                    ans = s;
                }
            }
        }
        return ans;
    }
}