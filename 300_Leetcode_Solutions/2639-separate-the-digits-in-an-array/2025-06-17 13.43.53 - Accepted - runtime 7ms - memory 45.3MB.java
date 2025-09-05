class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lt=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
        int l=(int)Math.log10(nums[i])+1;
        if(l>1)
        {
            int k=nums[i];
            Stack<Integer> str=new Stack<>();
            while(k>0)
            {
                int t=k%10;
                str.push(t);
                k/=10;
            }
            while(!str.isEmpty())
            {
                lt.add(str.pop());
            }
            
        }
        else
        {
            lt.add(nums[i]);
        }
        }
        int s=lt.size();
        int[] res=new int[s];
        for(int i=0;i<s;i++)
        {
            res[i]=lt.get(i);
        }
        return res;
    }
}