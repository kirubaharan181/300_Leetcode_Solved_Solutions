class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int odd=0,even=0;
        for(char key:hm.keySet())
        {
            if(hm.get(key)%2==0)
            {
                even=Math.max(even,hm.get(key));
            }
            else
            {
                odd=Math.max(odd,hm.get(key));
            }
        }
        
        return (odd == 0 || even == 0)?-1:odd - even;
    }
}