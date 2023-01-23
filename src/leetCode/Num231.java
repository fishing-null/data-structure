package leetCode;

public class Num231 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        int count = 0;
        while (n > 0){
            n &= (n-1);
            count += 1;
        }
        if(count == 1){
            return true;
        }
        return false;
    }
}
