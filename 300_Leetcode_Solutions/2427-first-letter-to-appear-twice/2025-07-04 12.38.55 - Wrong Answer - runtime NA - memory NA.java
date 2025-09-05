class Solution {
    public char repeatedCharacter(String s) {
       char ch='a';
       for(int i=0;i<s.length()-1;i++)
       {
            if(s.charAt(i)==s.charAt(i+1))
            {
                ch=s.charAt(i);
                break;
            }
       } 
       return ch;
    }
}