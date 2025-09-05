class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] a1=ransomNote.toCharArray();
        char[] a2=magazine.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        String k1=new String(a1);
        String k2=new String(a2);
        return k2.contains(k1);
    }
}