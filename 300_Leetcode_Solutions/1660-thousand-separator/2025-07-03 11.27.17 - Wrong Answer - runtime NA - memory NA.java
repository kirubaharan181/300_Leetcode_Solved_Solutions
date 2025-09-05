class Solution {
    public String thousandSeparator(int n) {
        String st=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        if(n<1000)
        {
            return st;
        }
        else
        {
            sb.append(st.charAt(0)).append('.');
            for(int i=1;i<st.length();i++)
            {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();
    }
}