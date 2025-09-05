class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        char prev='0';
        for(char k:s.toCharArray())
        {
            if(k==prev)
            {
                c++;
            }
            else
            {
                c=1;
                prev=k;
            }
            if(c<=2)
            {
                sb.append(k);
            }
        }
        return sb.toString();
    }
}