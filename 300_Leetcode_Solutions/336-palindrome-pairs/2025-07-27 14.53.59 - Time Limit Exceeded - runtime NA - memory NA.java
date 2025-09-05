class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        int n = words.length;

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {

                if (isPal(words[i], words[j])) 
                {
                    list.add(Arrays.asList(i, j));
                }
                if (isPal(words[j], words[i])) 
                {
                    list.add(Arrays.asList(j, i));
                }
            }
        }
        return list;
    }

    private boolean isPal(String a, String b) 
    {
        int left = 0;
        int right = a.length() + b.length() - 1;

        while (left < right) 
        {
            char cLeft  = left  < a.length() ? a.charAt(left) : b.charAt(left  - a.length());
            char cRight = right < a.length() ? a.charAt(right): b.charAt(right - a.length());
            if (cLeft != cRight) return false;
            left++;
            right--;
        }
        return true;
    }
}