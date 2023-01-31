package array.leetcode;

public class Num2319 {
    public static void main(String[] args) {
        Num2319 num2319 = new Num2319();
        num2319.checkXMatrix(new int[][] {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}});

    }
    public boolean checkXMatrix(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        //检查主对角线
        boolean[][] flag = new boolean[m][n];
        for (int i = 0,j = 0; i < m && j < n; i++,j++) {
            flag[i][j] = true;
            if(grid[i][j] == 0){
                return false;
            }
        }
        //检查副对角线
        for (int i = 0,j = n-1; i < m && j >= 0; i++,j--) {
            flag[i][j] = true;
            if(grid[i][j] == 0){
                return false;
            }
        }
        //检查其他格
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(flag[i][j] != true && grid[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
