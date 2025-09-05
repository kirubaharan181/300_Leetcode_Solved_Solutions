import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lt = new ArrayList<>();
        for (int i=left; i<=right; i++) 
        {
            int l=(int)Math.log10(i) + 1;
            if (l>1) 
            {
                int k=i;
                boolean b=true;
                while (k>0) 
                {
                    int t=k % 10;
                    if (t==0 || i%t!=0) 
                    {
                        b=false;
                        break;
                    }
                    k=k/10; 
                }
                if (b) 
                {
                    lt.add(i);
                }
            } 
            else 
            {
                lt.add(i);
            }
        }
        return lt;
    }
}
