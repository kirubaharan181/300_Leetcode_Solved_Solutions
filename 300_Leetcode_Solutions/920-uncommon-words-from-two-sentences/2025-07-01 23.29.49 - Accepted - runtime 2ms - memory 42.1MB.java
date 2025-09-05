class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] k1=s1.split(" ");
        String[] k2=s2.split(" ");
        ArrayList<String> l = new ArrayList<>();
        l.addAll(Arrays.asList(k1));
        l.addAll(Arrays.asList(k2));
        Map<String,Integer> hm=new HashMap<>();
        for(String m:l)
        {
            hm.put(m,hm.getOrDefault(m,0)+1);
        }
        int c=0;
        String t="";
        ArrayList<String> l1=new ArrayList<>();
        for(String key:hm.keySet())
        {
            if(hm.get(key)==1)
            {
                l1.add(key);
            }
        }
        String[] res=l1.toArray(new String[0]);
        return res;

    }
}