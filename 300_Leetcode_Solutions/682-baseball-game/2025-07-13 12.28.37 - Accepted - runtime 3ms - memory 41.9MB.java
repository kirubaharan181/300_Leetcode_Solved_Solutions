class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(String k:operations)
        {
            if(!k.equals("C") && !k.equals("D") && !k.equals("+"))
            {
                s.push(Integer.parseInt(k));
            }
            else if(k.equals("C") || k.equals("D"))
            {
                if(k.equals("C"))
                {
                    s.pop();
                }
                else
                {
                    s.push(s.peek()*2);
                }
            }
            else
            {
                int s1=s.pop();
                int s2=s.pop();
                int res=s2+s1;
                s.push(s2);
                s.push(s1);
                s.push(res);
            }
            
        }
        int sum=0;
        while (!s.isEmpty()) 
        {
            sum += s.pop();
        }
        return sum;
    }
}