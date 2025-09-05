class Solution {
    public boolean isBalanced(String num) {
        int s1=0,s2=0;
        int[] n = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            n[i] = num.charAt(i) - '0';
        }
        for(int i=0;i<n.length;i++)
        {
            if(i%2==0)
            {
                s1+=n[i];
            }
            else
            {
                s2+=n[i];
            }
        }
        return s1==s2?true:false;
    }
}