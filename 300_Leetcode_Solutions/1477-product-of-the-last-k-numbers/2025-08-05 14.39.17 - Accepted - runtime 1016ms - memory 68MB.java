class ProductOfNumbers {
    ArrayList<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();
    }
    
    public void add(int num) {
        l.add(0,num);
    }
    
    public int getProduct(int k) {
        int res=1;
        for(int i=0;i<k;i++)
        {
            res*=l.get(i);
        }
        return res;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */