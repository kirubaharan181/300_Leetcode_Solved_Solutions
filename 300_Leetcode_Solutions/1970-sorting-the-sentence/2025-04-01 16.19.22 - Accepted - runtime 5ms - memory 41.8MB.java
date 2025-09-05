import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public String sortSentence(String s) {
        String[] str = s.split("\\s+");
        int l = str.length;
        StringBuilder sb = new StringBuilder();
        String[] res = new String[l];

        for (int i = 0; i < l; i++) 
        {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(str[i]);

            if (m.find()) 
            {
                int k = Integer.parseInt(m.group());
                res[k - 1] = str[i];
            }
        }
        
        for (int j = 0; j < l; j++) 
        {
            sb.append(res[j].replaceAll("\\d", "")).append(" ");
        }
        
        return sb.toString().trim();
        
    }
}