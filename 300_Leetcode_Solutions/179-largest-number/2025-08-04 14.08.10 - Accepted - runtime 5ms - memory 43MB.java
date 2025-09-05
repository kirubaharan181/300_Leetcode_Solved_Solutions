class Solution {
    public String largestNumber(int[] nums) {
        String[] res=new String[nums.length];
        int i=0;

        for(int k:nums)
        {
            res[i++]=String.valueOf(k);
        }
        Arrays.sort(res,(a,b)->(b+a).compareTo(a+b));
        
        if(res[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for(String s:res)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}