class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        List<Integer> l=Arrays.stream(nums).boxed().collect(Collectors.toList());
        while(k>0)
        {
            int m=Collections.min(l);
            int ind=l.indexOf(m);
            int s=m*multiplier;
            l.set(ind,s);
            k--;
        }
        int[] res=l.stream().mapToInt(Integer::intValue).toArray();
        return res;

    }
}