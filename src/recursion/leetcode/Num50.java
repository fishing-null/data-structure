package recursion.leetcode;

public class Num50 {
    public static void main(String[] args) {

    }
    public double myPow(double x, int n) {
        long N = n;
        return n < 0 ? 1.0 / pow(x,-N):pow(x, N);
    }
    public double pow(double x, long n){
        if(n == 0) return 1.0;
        double tmp = pow(x,n/2);
        return n % 2 == 0 ? tmp*tmp :tmp*tmp*x;
    }
}
