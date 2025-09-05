class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String[] s=date.split("-");
        for(int i=0;i<s.length;i++)
        {   
            int d=Integer.parseInt(s[i]);
            String k=Integer.toBinaryString(d);
            sb.append(k).append("-");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}