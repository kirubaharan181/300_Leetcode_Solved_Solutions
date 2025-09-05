class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        String t=String.valueOf(num);
        int c=0;
        for(char k:t.toCharArray())
        {
            if(k!='9' && c==0)
            {
                sb.append('9');
                c++;
            }
            else
            {
                sb.append(k);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}