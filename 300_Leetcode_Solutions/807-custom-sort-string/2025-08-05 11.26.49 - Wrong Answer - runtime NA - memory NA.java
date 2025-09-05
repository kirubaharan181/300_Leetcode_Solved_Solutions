class Solution {
    public String customSortString(String order, String s) {
        char[] od=order.toCharArray();
        Arrays.sort(od);
        String od1=new String(od);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(od1.length()==i)
            {
                sb.append(s.charAt(i));
                break;
            } 
            else
            {
            if(od1.charAt(i)==s.charAt(i))
            {
                sb.append(order.charAt(i));
            }
            else
            {
                sb.append(s.charAt(i));
            }
            }
            
        }
        return sb.toString();
    }
}