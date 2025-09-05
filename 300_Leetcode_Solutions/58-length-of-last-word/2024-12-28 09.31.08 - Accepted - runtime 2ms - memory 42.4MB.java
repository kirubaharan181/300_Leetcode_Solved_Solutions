class Solution {
    public int lengthOfLastWord(String s) {
      String result = s.trim().replaceAll("\\s+", " ");
      String[] res=result.split(" ");
        int l=res.length;
        String k=res[l-1];     
        return k.length();
    }
}



