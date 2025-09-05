class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int odd=-1,even=Integer.MAX_VALUE;
        for(int f : hm.values())
        {
            if((f & 1) == 1)
            {
                odd=Math.max(odd,f);
            }
            else
            {
                even=Math.min(even,f);
            }
        }
        
        return (odd == -1 || even == Integer.MAX_VALUE)?-1:odd - even;
    }
}