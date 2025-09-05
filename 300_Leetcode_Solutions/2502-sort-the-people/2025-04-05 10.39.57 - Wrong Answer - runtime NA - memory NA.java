class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] s=new int[heights.length];
        String[] st=new String[names.length];
        for(int i=0;i<heights.length;i++)
        {
            s[i]=heights[i];
        } 
        Arrays.sort(s);
        for(int j=0;j<heights.length;j++)
        {
            for(int k=0;k<heights.length;k++)
            {
                if(s[j]==heights[k])
                {
                    st[j]=names[k];
                }
            }
            
        }
        return st;

    }
}