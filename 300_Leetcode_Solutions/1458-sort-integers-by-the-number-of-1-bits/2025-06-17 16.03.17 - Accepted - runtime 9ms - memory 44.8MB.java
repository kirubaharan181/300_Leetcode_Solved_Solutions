class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] k = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(k, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if (countA == countB) return a - b;
            return countA - countB;
        });
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = k[i];
        }
        return arr;
    }
}
