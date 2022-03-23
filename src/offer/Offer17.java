package offer;

public class Offer17 {
    public int[] printNumbers(int n) {
        int[] ret = new int[(int)Math.pow(10,n)-1];
        for (int i = 1; i + 1< Math.pow(10,n); i++) {
            ret[i] = i+1;
        }
        return ret;
    }
}
