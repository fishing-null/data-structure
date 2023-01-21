package leetCode;

public class Offer1607 {
    public static void main(String[] args) {

    }
    public int maximum(int a, int b) {
        long dif = (long)a-(long)b;
        int k = (int)(dif>>63);
        return (k+1)*a - b*k;
    }
}
