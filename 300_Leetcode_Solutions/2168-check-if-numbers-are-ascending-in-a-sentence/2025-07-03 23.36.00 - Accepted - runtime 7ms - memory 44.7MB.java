class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        List<Integer> l1=new ArrayList<>();
        for(String k: str)
        {
            if(k.matches("\\d+"))
            {
                l1.add(Integer.parseInt(k));
            }
        }
        for (int i=1;i<l1.size();i++) 
        {
            if (l1.get(i)<=l1.get(i - 1)) 
            {
                return false;
            }
        }
        return true;
    }
}