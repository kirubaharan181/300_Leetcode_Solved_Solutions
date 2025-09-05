class Solution {
    public void duplicateZeros(int[] arr) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0 )
            {
                sb.append('0').append('0');
            }
            else
            {
                sb.append((char)(arr[i]+ '0'));
            }
        }
            for (int i=0;i<arr.length;i++) 
            {
                arr[i] = sb.charAt(i) - '0';
            }   
    }
}