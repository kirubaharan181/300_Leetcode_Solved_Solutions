class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l,pre=null;
        for(int i=0;i<=33;i++)
        {
            l=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    l.add(1);
                }
                else
                {
                    l.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=l;
            res.add(l);
        }
        return res.get(rowIndex);
    }
}