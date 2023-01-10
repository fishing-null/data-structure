package array.leetcode;

public class Num566 {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n){
            return mat;
        }
        int[][] ret = new int[r][c];
        int[] tmp = new int[m*n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tmp[count++] = mat[i][j];
            }
        }
        count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = tmp[count++];
            }
        }
        return ret;
    }
}
