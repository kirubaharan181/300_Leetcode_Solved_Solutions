class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < words.length; i++)
        {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            int len = word.length();

            for (int j = 0; j <= len; j++) 
            {
                String prefix = word.substring(0, j);
                String suffix = word.substring(j);

                if (isPalindrome(prefix)) 
                {
                    String rev = new StringBuilder(suffix).reverse().toString();
                    if (map.containsKey(rev) && map.get(rev) != i) 
                    {
                        res.add(Arrays.asList(map.get(rev), i));
                    }
                }

                if (isPalindrome(suffix) && suffix.length() != 0) 
                {
                    String rev = new StringBuilder(prefix).reverse().toString();
                    if (map.containsKey(rev) && map.get(rev) != i) 
                    {
                        res.add(Arrays.asList(i, map.get(rev)));
                    }
                }
            }
        }

        return res;
    }

    private boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) 
        {
            if (s.charAt(left++) != s.charAt(right--)) 
            {
                return false;
            }
        }
        return true;
    }
}