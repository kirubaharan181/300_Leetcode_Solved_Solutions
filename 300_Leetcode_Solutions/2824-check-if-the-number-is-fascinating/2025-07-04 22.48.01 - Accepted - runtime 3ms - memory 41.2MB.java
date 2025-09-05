class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb=new StringBuilder();
        int s1=2*n;
        int s2=3*n;
        boolean b=false;
        sb.append(n).append(s1).append(s2);
        String str=sb.toString();
        if(str.contains("0"))
        {
            b=false;
        }
        else
        {
           Map<Integer,Integer> hm=new HashMap<>();
           for(char m:str.toCharArray())
           {
                int k= m - '0';
                hm.put(k,hm.getOrDefault(k,0)+1);
           }
           for(int i=1;i<=9;i++)
           {
            if(hm.getOrDefault(i,0)!=1)
            {
                b=false;
                break;
            }
            else
            {
                b=true;
            }
           }
        }
        return b;
    }
}