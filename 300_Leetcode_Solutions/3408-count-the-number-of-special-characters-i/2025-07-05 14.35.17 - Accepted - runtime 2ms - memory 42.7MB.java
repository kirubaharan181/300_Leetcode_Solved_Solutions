class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        for (char k : word.toCharArray()) 
        {
            if (Character.isLowerCase(k)) 
            {
                lower.add(k);
            }
            else
            {
                upper.add(k);
            }
            
        }
        int c = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (lower.contains(ch) && upper.contains(Character.toUpperCase(ch))) {
                c++;
            }
        }
        return c;
    }
}