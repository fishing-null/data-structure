package greedyAlgorithm;

public class Num1605 {
    public static void main(String[] args) {
        Num1605 num1605 = new Num1605();
        int[] rowSum = new int[] {5,7,10};
        int[] colSum = new int[] {8,6,8};
        num1605.restoreMatrix(rowSum,colSum);

    }
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length, m = colSum.length;
        int[][] matrix = new int[n][m];
        int i = 0, j = 0;
        while (i < n && j < m) {
            int v = Math.min(rowSum[i], colSum[j]);
            matrix[i][j] = v;
            rowSum[i] -= v;
            colSum[j] -= v;
            if (rowSum[i] == 0) {
                ++i;
            }
            if (colSum[j] == 0) {
                ++j;
            }
        }
        return matrix;
    }

}
