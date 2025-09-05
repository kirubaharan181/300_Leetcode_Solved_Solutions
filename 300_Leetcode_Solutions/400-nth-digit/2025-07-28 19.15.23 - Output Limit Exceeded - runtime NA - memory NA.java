class Solution {
    public int findNthDigit(int n) {
        if (n<=9) return n;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(l.size()<n)
            {
            if(i<=9)
            {
                l.add(i);
            }
            else
            {
                int t=i;
                List<Integer> l2=new ArrayList<>();
                while(t>0)
                {
                    l2.add(t%10);
                    t/=10;
                }
                Collections.reverse(l2);
                l.addAll(l2);
            }
            }
            else
            {
                break;
            }
        }
        System.out.println(l);
        return l.get(n-1);
    }
}