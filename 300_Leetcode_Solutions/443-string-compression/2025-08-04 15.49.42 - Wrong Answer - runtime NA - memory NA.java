class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        Map<Character, Integer> hm = new HashMap<>();
        for (char k : chars)
        {
            hm.put(k, hm.getOrDefault(k, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char key : hm.keySet()) 
        {
            sb.append(key);
            int count = hm.get(key);
            if (count > 1)
            {
                sb.append(count);
            }
        }

        int len = Math.min(chars.length, sb.length());
        for (int i = 0; i < len; i++)
        {
            chars[i] = sb.charAt(i);
        }

        return len;
    }
}