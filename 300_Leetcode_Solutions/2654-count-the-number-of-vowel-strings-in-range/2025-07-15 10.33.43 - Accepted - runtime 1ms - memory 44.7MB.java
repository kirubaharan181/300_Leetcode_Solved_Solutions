class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            String str=words[i];
            if("aeiouAEIOU".contains(String.valueOf(str.charAt(0))) && "aeiouAEIOU".contains(String.valueOf(str.charAt(str.length()-1))))
            {
                c++;
            }

        }
        return c;
    }
}