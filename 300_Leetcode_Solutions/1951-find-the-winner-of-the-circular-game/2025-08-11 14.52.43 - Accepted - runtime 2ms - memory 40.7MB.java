class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l.add(i);
        }

        int k1=0;
        while(n>1)
        {
           k1=(k1+(k-1))%n;
           l.remove(k1);
           n--;
        }
        return l.get(0);
    }
}