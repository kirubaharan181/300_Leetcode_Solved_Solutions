class Solution {
    public String strWithout3a3b(int a, int b) {
        String res="";
        int c1=0,c2=0;
        while(a>0 || b>0)
        {
            if(a>b)
            {
                if(a>1)
                {
                    res+="aa";
                    a-=2;
                }
                else
                {
                    res+='a';
                    a-=1;
                }
                if(b>0)
                {
                    res+='b';
                    b-=1;
                }
            }
            else if(b>a)
            {
                if(b>1)
                {
                    res+="bb";
                    b-=2;
                }
                else
                {
                    res+='b';
                    b-=1;
                }
                if(a>0)
                {
                    res+='a';
                    a-=1;
                }
            }
            else
            {
                res+="ab";
                a-=1;b-=1;
            }
        }
        return res;
    }
}