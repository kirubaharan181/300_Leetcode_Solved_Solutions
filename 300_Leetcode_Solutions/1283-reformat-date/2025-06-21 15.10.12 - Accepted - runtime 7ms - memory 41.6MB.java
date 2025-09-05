class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String d = parts[0].replaceAll("[a-zA-Z]", "");
        String m = parts[1];
        String y = parts[2];
        
        String[] mn = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String m_num = "";
        for (int i = 0; i < mn.length; i++) 
        {
            if (mn[i].equals(m)) 
            {
                m_num = String.format("%02d", i + 1);
                break;
            }
        }
        
        String dNum = d.length() == 1 ? "0" + d : d;
        
        StringBuilder result = new StringBuilder();
        result.append(y).append("-").append(m_num).append("-").append(dNum);
        
        return result.toString();
    }
}