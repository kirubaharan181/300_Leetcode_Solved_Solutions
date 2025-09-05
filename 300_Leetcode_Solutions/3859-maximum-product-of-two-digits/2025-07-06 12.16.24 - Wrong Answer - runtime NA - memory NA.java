class Solution {
    public int maxProduct(int n) {
     int prod=1;
     for(int k=n; k>0; prod*=k%10 , k/=10) ;
     return prod;  
    }
}