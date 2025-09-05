class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] str=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            int t=0;
            for(int j=0;j<dictionary.size();j++)
            {
                if(str[i].startsWith(dictionary.get(j)))
                {
                    sb.append(dictionary.get(j)).append(" ");
                    t=1;
                }
                
            }
            if(t==0)
            {
                sb.append(str[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}