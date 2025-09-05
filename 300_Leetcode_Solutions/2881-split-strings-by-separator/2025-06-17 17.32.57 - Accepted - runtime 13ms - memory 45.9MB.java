class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
       List<String> st = new ArrayList<>();
        String c = String.valueOf(separator);
        for (String k : words) 
        {
            String[] w = k.split("\\" + separator);
            for (String res : w) 
            {
                if (!res.isEmpty()) 
                { 
                    st.add(res);
                }
            }
        }
        return st;
    }
    }
