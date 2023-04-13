package math.leetcode;

public class Num201 {
    public static void main(String[] args) {

    }
    public int rangeBitwiseAnd(int left, int right) {
        while (left < right){
            right &= right-1;
        }
        return right;
    }
}
