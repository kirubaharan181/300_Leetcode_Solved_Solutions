class Solution {
    public String generateTheString(int n) {
        int c=(n%2==0)?n-1:n;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<c;i++)
        {
            sb.append('k');
        }
        if(n%2==0)
        {
            sb.append('p');
        }
        return sb.toString();
    }
}