class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=command.length();i++)
        {
            if(Character.isLetter(command.charAt(i-1)))
            {
                sb.append(command.charAt(i-1));
            }
            else if(command.charAt(i-1)=='(' && command.charAt(i)==')')
            {
                sb.append('o');
                i++;
            }
        }
        return sb.toString();
    }
}