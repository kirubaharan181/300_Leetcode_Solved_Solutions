class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hm=new LinkedHashMap<>();
        for(char k:s.toCharArray())
        {
            hm.put(k,hm.getOrDefault(k,0)+1);
        }

        for(char key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
               return s.indexOf(key);
            }
        }
        
        return -1;
    }
}