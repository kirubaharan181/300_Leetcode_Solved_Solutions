import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> l1 = new LinkedList<>(Arrays.asList(list1));
        List<String> l2 = new LinkedList<>(Arrays.asList(list2));
        
        l1.retainAll(l2);
        System.out.println(l1);
        
        if (l1.size() == 1) 
        {
            return new String[]{l1.get(0)};
        }
        
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        
        for (String r : l1) 
        {
            int index1 = Arrays.asList(list1).indexOf(r);
            int index2 = Arrays.asList(list2).indexOf(r);
            int sum = index1 + index2;
            if (sum < min) {
                min = sum;
                res.clear();
                res.add(r);
            } 
            else if (sum == min) 
            {
                res.add(r);
            }
        }
        
        return res.toArray(new String[0]);
    }
}