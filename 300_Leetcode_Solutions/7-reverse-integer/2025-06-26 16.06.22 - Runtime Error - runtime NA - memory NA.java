class Solution {
    public int reverse(int x) {
        String s=String.valueOf(x);
        StringBuilder sb=new StringBuilder(s);
        boolean b=false;

        if(sb.charAt(s.length()-1)=='0' )
        {
            sb.deleteCharAt(s.length()-1);
        }
        if(sb.charAt(0)=='-')
        {
            sb.deleteCharAt(0);
            b=true;
        }
        sb.reverse();
        System.out.print(sb.toString());
        
        int res=0;
            res=Integer.parseInt(sb.toString());
            if(b)
            {
                res=-res;
            }
            
        return res;
    }
}