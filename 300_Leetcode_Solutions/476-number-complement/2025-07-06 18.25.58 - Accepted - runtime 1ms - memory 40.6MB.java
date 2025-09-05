class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder();
        String k=sb.toString();
        
        for(char m:k.toCharArray())
        {
            sb1.append(m=='0'?'1':'0');
        }
        return Integer.parseInt(String.valueOf(sb1),2);
    }
}