class Solution {
    public int superPow(int a, int[] b) {
        if(a==1) return 1;
        if(a==0) return 0;
        if(b.length==1) return (int)Math.pow(a,b[0]);
        StringBuilder sb=new StringBuilder();
        for(int k:b)
        {
            sb.append(k);
        }
        Long l=Long.parseLong(sb.toString());
        return (int)Math.pow(a,l);
    }
}