package leetCode;

public class Num190 {
    public static void main(String[] args) {

    }
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            ret |= (n&1)<<(31-i);
            n >>>= 1;
        }
        return ret;
    }
}
