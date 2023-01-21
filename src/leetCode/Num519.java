package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Num519 {
    public static void main(String[] args) {
        Num519 num519 = new Num519(3,3);
        num519.flip();
    }
    int[][] matrix;
    int m,n;
    Random random;
    int count;
    Map<Integer,Integer> map = new HashMap<>();

    public Num519(int m, int n) {
        matrix = new int[m][n];
        this.m = m;
        this.n = n;
        random = new Random();
        count = m*n;
    }

    public int[] flip() {
        int x = random.nextInt(count);
        count--;
        int idx = map.getOrDefault(x,x);
        map.put(x,map.getOrDefault(count,count));
        return new int[] {idx/n,idx%n};
    }

    public void reset() {
        map.clear();
        count = m*n;
    }
}
