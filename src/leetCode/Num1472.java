package leetCode;

public class Num1472 {
    public static void main(String[] args) {

    }
    public int largestAltitude(int[] gain) {
        int m = gain.length;
        int[] ret = new int[m+1];
        for (int i = 0; i < m; i++) {
            ret[i+1] = ret[i]+gain[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ret.length; i++) {
            max = Math.max(max,ret[i]);
        }
        return max;
    }
}
