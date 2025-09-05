class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb=new StringBuilder();
        for(int m:num)
        {
            sb.append(String.valueOf(m));
        }
        String str=sb.toString();
        int a=Integer.parseInt(str);
        String res=String.valueOf(a+k);
        
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<res.length();i++)
        {
            l.add(res.charAt(i)-'0');
        }
        return l;
        
    }
}