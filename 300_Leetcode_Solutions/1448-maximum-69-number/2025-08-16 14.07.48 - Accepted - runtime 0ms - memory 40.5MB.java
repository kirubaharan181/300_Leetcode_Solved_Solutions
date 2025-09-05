class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        if(!str.contains("6")) return num;
        StringBuilder sb=new StringBuilder(str);
        int ind=str.indexOf('6');
        sb.setCharAt(ind,'9');
        return Integer.parseInt(sb.toString());
    }
}