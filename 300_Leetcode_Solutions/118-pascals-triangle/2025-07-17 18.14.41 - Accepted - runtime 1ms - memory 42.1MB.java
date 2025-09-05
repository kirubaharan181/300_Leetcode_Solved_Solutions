class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l,p=null;
        for(int i=0;i<numRows;i++)
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
                    l.add(p.get(j-1)+p.get(j));
                }
            }
            p=l;
            res.add(l);
        }
        return res;
    }
}