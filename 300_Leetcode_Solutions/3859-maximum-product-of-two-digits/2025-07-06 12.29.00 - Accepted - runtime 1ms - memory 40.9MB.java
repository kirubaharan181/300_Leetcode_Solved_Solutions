class Solution {
    public int maxProduct(int n) {
     int res=0;
     List<Integer> l=new ArrayList<>();

     for(int k=n; k>0; l.add(k%10) , k/=10) ;

     for(int i=0;i<l.size()-1;i++)
     {
        for(int j=i+1;j<l.size();j++)
        {
           res=Math.max(res,l.get(i)*l.get(j));
        }
     }
     return res;  
    }
}