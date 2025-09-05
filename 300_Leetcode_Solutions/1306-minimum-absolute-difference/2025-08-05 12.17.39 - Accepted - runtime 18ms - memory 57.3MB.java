class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
      Arrays.sort(arr);
      int min=Integer.MAX_VALUE;
      List<List<Integer>> l=new ArrayList<>();
      for(int i=0;i<arr.length-1;i++)
      {
        min=Math.min(min,arr[i+1]-arr[i]);
      }  
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i+1]-arr[i]==min)
        {
            l.add(Arrays.asList(arr[i],arr[i+1]));
        }
      }
      return l;
    }
}