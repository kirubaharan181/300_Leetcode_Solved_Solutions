import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> validStrings(int n) 
    {
        List<String> l = new ArrayList<>();
        int t = (int) Math.pow(2, n);

        for (int i = 0; i < t; i++) 
        {
            String st = Integer.toBinaryString(i);
            while (st.length() < n) 
            {
                st = "0" + st;
            }
        
            if (!st.contains("00")) 
            {
                l.add(st);
            }
        }
        return l;
    }
}