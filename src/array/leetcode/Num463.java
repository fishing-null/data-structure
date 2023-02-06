package array.leetcode;

public class Num463 {
    public static void main(String[] args) {
        Num463 num463 = new Num463();
        int ret = num463.islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}});
        System.out.println(ret);
    }
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    public int islandPerimeter(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int ret = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret += dfs(grid,i,j);
            }
        }
        return ret;
    }
    private int dfs(int[][] grid,int i,int j){
        int total = 4;
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] != 1){
            return 0;
        }
        for (int k = 0; k < 4; k++) {
            int di = i+dx[k];
            int dj = j+dy[k];
            if(di >= 0 && dj >= 0 && di < grid.length && dj < grid[0].length && grid[di][dj] == 1){
                total--;
            }
        }
        return total;
    }
}
