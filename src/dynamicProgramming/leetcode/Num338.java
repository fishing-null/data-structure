package dynamicProgramming.leetcode;

public class Num338 {
    public static void main(String[] args) {

    }
    public int[] countBits(int n) {
        int[] ret = new int[n+1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = countOnes(i);
        }
        return ret;
    }
    public int countOnes(int n){
        int ones = 0;
        while(n > 0){
            n = n&(n-1);
            ones++;
        }
        return ones;
    }
}
