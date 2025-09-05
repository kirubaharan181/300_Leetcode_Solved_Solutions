import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String p = paragraph.toLowerCase();
        Set<String> b = new HashSet<>();
        for (String w:banned) 
        {
            b.add(w.toLowerCase());
        }
        String[] s = p.split("\\W+");
        Map<String, Integer> hm = new HashMap<>();
        for (String k : s) {
            if (!b.contains(k)) {
                hm.put(k, hm.getOrDefault(k, 0) + 1);
            }
        }
        String res = "";
        int m = 0;
        for (String key:hm.keySet()) 
        {
            int c = hm.get(key);
            if (c > m) 
            {
                m = c;
                res = key;
            }
        }
        return res;
    }
}