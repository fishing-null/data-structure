package array.leetcode;

import java.util.HashSet;

public class Num2352 {
    public static void main(String[] args) {
        Num2352 num2352 = new Num2352();
        num2352.equalPairs(new int[][] {{3,2,1},{1,7,6},{2,7,7}});

    }
    public int equalPairs(int[][] grid) {
        int count = 0, n = grid.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(equals(row,col,n,grid)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean equals(int row, int col,int n ,int[][] grid){
        for (int i = 0; i < n; i++) {
            if(grid[row][i] != grid[i][col]){
                return false;
            }
        }
        return true;
    }
}
