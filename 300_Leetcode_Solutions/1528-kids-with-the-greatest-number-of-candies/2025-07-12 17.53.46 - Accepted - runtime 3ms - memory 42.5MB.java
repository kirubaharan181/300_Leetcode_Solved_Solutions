class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> l=new ArrayList<>();
     List<Integer> cand=Arrays.stream(candies).boxed().collect(Collectors.toList());
     int m=Collections.max(cand);  

     for(int k:candies)
     {
        if(k+extraCandies>=m)
        {
            l.add(true);
        }
        else
        {
            l.add(false);
        }
     } 
     return l;
     
    }
}