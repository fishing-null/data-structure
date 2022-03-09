package Offer;

public class Offer0107 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            matrix[i]=reverse(matrix[i]);
        }
        for (int i = 0; i < row-1; i++) {
            for (int j = row-1-i; j>=0 ; j--) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[row-1-j][row-1-i];
                matrix[row-1-j][row-1-i] = tmp;
            }
        }
    }
    public static int[] reverse(int[] row){
        for (int i = 0; i < row.length/2; i++) {
            swap(row,i,row.length-1-i);
        }
        return row;
    }
    public static void swap(int[] a,int x,int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
