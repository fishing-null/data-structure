package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Num120 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lis1 = new ArrayList<>();
        lis1.add(2);
        list.add(lis1);
        List<Integer> lis2 = new ArrayList<>();
        lis2.add(3);
        lis2.add(4);
        list.add(lis2);
        List<Integer> lis3 = new ArrayList<>();
        lis3.add(6);lis3.add(5);lis3.add(7);
        list.add(lis3);
        List<Integer> lis4 = new ArrayList<>();
        lis4.add(4);lis4.add(1);lis4.add(8);lis4.add(3);
        list.add(lis4);
        minimumTotal(list);
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            f[i][0] = f[i-1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                f[i][j] = Math.min(f[i-1][j-1],f[i-1][j])+triangle.get(i).get(j);
            }
            f[i][i] = f[i-1][i-1]+triangle.get(i).get(i);
        }
        int minTotal = f[n-1][0];
        for (int i = 1; i < n; i++) {
            minTotal = Math.min(minTotal,f[n-1][i]);
        }
        return minTotal;
    }
}
