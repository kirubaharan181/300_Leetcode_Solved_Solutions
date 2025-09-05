class Solution {
    public int mostWordsFound(String[] sentences) {
        int l=sentences.length;
        int[] c=new int[l];
        for(int i=0;i<l;i++)
        {
            c[i]=sentences[i].split("\\s+").length;
        }
        Arrays.sort(c);
        int res=c[l-1];
        return res;
    }
}