package math.leetcode;

public class Num204 {
    public static void main(String[] args) {
        Num204 num204 = new Num204();
        num204.countPrimes(10);

    }
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2;i<n;i++){
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }
    public boolean isPrime(int x){
        for (int i = 2; i*i < x; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
