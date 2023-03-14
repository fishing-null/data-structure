package array.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Num200 {
    public static void main(String[] args) {
        Num200 num200 = new Num200();
        char[][] ch1 = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        char[][] ch2 = new char[][]{{'1', '1', '1', '1', '1', '1', '1'}};
        System.out.println(num200.numIslands(ch2));
        System.out.println(num200.numIslands(ch1));
    }

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    //bfs广度优先搜索
    public class position {
        int x, y;

        public position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getY() {
            return y;
        }

        public int getX() {
            return x;
        }
    }

    public int numIslands(char[][] grid) {
        Queue<position> queue = new LinkedList<>();
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    count++;
                    queue.add(new position(j, i));
                }
                while (!queue.isEmpty()) {
                    position tmp = queue.remove();
                    for (int k = 0; k < 4; k++) {
                        int x = tmp.getX() + dx[k];
                        int y = tmp.getY() + dy[k];
                        if (x >= 0 && x < n && y >= 0 && y < m && grid[y][x] == '1') {
                            grid[y][x] = '0';
                            queue.add(new position(x, y));
                        }
                    }
                }
            }
        }
        return count;
    }
}

