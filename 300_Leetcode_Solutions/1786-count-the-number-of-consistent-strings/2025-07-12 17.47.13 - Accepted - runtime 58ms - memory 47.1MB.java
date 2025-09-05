class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for (String str:words) 
        {
            Set<Character> st = new LinkedHashSet<>();
            for (char k : str.toCharArray()) 
            {
                st.add(k);
            }

            StringBuilder sb = new StringBuilder();
            for (char k1:st) 
            {
                sb.append(k1);
            }
            String res = sb.toString();
            boolean fl = true;
            for (char ch:st) 
            {
                if (!allowed.contains(String.valueOf(ch))) 
                {
                    fl = false;
                    break;
                }
            }
            if (fl) 
            {
                c++;
            }
        }
        return c;
    }
}
