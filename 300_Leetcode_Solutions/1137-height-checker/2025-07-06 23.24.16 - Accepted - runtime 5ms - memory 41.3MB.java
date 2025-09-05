class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        List<Integer> l=Arrays.stream(heights).boxed().collect(Collectors.toList());
        Collections.sort(l);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=l.get(i))
            {
                c++;

            }
        }
        return c;
    }
}