class Solution {
    public double average(int[] salary) {
        List<Integer> l=Arrays.stream(salary).boxed().collect(Collectors.toList());
        Collections.sort(l);
        return (double)(l.get(1)+l.get(l.size()-2))/2;
    }
}