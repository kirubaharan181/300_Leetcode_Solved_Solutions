class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char k1:s.toCharArray())
        {
            int st=k1 -'a' + 1;
            sb.append(st);
        }
        String m=sb.toString();
        
        while(k>0)
        {
          int r=0;
          for(char a:m.toCharArray())
          {
            r+=a -'0';
          }
          m=String.valueOf(r);
          k--;
        }
        return Integer.parseInt(m);
    }
    
}