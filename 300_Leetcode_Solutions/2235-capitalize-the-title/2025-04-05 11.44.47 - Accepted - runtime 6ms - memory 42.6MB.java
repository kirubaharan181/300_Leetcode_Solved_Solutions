class Solution 
{
    public String capitalizeTitle(String title) 
    {
         String s = title.toLowerCase();
        
        // Split the title into words using one or more spaces as the delimiter
        String[] words = s.split("\\s+");
        
        // Use StringBuilder to efficiently build the transformed string
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) 
        {
            int l = words[i].length();

            if (l > 2) 
            {
                sb.append(Character.toUpperCase(words[i].charAt(0)))
                  .append(words[i].substring(1))
                  .append(" ");
            } else 
            {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
