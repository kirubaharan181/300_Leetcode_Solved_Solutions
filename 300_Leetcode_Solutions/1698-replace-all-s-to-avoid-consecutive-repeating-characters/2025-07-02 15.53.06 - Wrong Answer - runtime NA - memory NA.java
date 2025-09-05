class Solution {
    public String modifyString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char k:s.toCharArray())
        {
            if(k!='?')
            {
                sb.append(k);
            }
            else
            {
                sb.append('a');
            }
        }
        return sb.toString();
    }
}