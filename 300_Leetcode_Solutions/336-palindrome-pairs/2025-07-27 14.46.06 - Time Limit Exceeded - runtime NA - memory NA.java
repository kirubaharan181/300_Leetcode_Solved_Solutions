class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s1,s2;
            for(int j=i+1;j<words.length;j++)
            {
                s1=words[i] + words[j];
                s2=words[j] + words[i]; 
                if(pal(s1))
                {
                    l.add(Arrays.asList(i,j));
                }
                if(pal(s2))
                {
                    l.add(Arrays.asList(j,i));
                }
            }
        }
        return l;
    }
    public boolean pal(String s)
    {
        int r=0,l=s.length()-1;
        boolean b=true;
        while(r<l)
        {
            if(s.charAt(r++)!=s.charAt(l--))
            {
                b=false;
                break;
            }
        }
        return b;
    }
}