class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] k=s.split(" ");
        if (k.length != pattern.length()) return false;
        Map s1=new HashMap();

        for(Integer i=0;i<k.length;++i)
        {
            if(s1.put(pattern.charAt(i),i) != s1.put(k[i],i))
            {
                return false;
            }
        }
        
        return true;

    }
}