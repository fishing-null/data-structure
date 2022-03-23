package Offer;

public class Offer10 {
    public static void main(String[] args) {
        fib(7);
    }
    public static int fib(int n) {
//        if(n == 0){
//            return 0;
//        }
//        int a = 0;
//        int b = 1;
//        for(int i = 2;i <= n;i++){
//            int tmp = (a+b)%1000000007;
//            a = b;
//            b = tmp;
//        }
//        return b;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i = 2;i<n+1;i++){
            F[i] = (F[i-1] + F[i-2])%1000000007;
        }
        return F[n];
    }
}
