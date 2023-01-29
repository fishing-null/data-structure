package array;

import java.util.LinkedList;
import java.util.Queue;

public class Num105 {
    public static void main(String[] args) {

    }
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int ret = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret = Math.max(ret,dfs(grid,i,j));
            }
        }
        return ret;
    }
    public int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 0;
        int ret = 1;
        for (int k = 0; k < 4; k++) {
            int next_i = i+dx[k],next_j = j+dy[k];
            ret += dfs(grid,next_i,next_j);
        }
        return ret;
    }
}
