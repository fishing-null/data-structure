package Offer;

public class Offer10 {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        int a = 0;
        int b = 1;
        for(int i = 2;i <= n;i++){
            int tmp = (a+b)%1000000007;
            a = b;
            b = tmp;
        }
        return b;
    }
}
