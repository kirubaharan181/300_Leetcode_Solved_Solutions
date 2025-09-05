class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res=new int[arr1.length];
        Arrays.sort(arr1);
        int k=0,ind=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    res[k++]=arr2[i];
                }
            }
        }
        List<Integer> l=new ArrayList<>();
        for (int num : arr1) 
        {
            boolean inArr2 = false;
            for (int x : arr2) 
            {
                if (x == num) 
                {
                    inArr2 = true;
                    break;
                }
            }
            if (!inArr2) 
            {
                l.add(num);
            }
        }
        l.sort(Integer::compareTo);
        for (int num : l) 
        {
            res[k++] = num;
        }
        return res;
    }
}