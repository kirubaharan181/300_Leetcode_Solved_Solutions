class Solution {
    public int maxFreqSum(String s) {
        int v=0,c=0;
        String str="aeiou";
        Map<Character,Integer> hm=new HashMap<>();
        for(char k:s.toCharArray())
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for(char key:hm.keySet())
        {
            if(str.contains(String.valueOf(key)))
            {
                v=Math.max(v,hm.get(key));
            }
            else
            {
                c=Math.max(c,hm.get(key));
            }
        }
          
        return v+c;     
    }
}