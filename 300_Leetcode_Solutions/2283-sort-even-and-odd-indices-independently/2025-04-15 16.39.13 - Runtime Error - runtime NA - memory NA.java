class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int length = nums.length;
        int[] odd = new int[(length + 1) / 2];
        int[] even = new int[length / 2];

        int oddInd = 0, evenInd = 0;
        for (int i = 0; i < length; i++) 
        {
            if (i % 2 == 0) 
            {
                even[evenInd++] = nums[i];
            } else 
            {
                odd[oddInd++] = nums[i];
            }
        }

        Arrays.sort(even);
        Integer[] oddInteger = Arrays.stream(odd).boxed().toArray(Integer[]::new);
        Arrays.sort(oddInteger, Collections.reverseOrder());

        int[] result = new int[length];
        oddInd = 0;
        evenInd = 0;
        for (int i = 0; i < length; i++) 
        {
            if (i % 2 == 0) 
            {
                result[i] = even[evenInd++];
            }
            else 
            {
                result[i] = oddInteger[oddInd++];
            }
        }

        return result;
    }
}