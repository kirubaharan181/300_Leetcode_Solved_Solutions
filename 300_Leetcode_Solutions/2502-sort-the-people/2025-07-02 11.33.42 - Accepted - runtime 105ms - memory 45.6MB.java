class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] res=new String[names.length];
        List<Integer> l=Arrays.stream(heights).boxed().collect(Collectors.toList());
        List<String> name =new ArrayList<>(Arrays.asList(names));

        int i=0;
        while(!l.isEmpty())
        {
            int c=Collections.max(l);
            int k=l.indexOf(c);

            res[i++]=name.get(k);
            l.remove(k);
            name.remove(k);
            
        }

        return res;
    }
}