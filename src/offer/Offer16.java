package offer;
public class Offer16 {
    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
        offer16.myPow(2.00000,-10);
    }
    public double myPow(double x, int n) {
        long N = n;
        return N >=0 ? quickMul(x,N) : 1.0 / quickMul(x,-N);

    }
    private double quickMul(double x,long n){
        if(n == 0){
            return 1.0;
        }
        double y = quickMul(x, n>>1);
        return n % 2 == 0 ? y*y : y*y*x;
    }
}
