package array.leetcode;

import java.util.*;

public class Num994 {
    public static void main(String[] args) {

    }
    int[] dx = new int[]{-1,1,0,0};
    int[] dy = new int[]{0,0,1,-1};
    public class Position{
        int x;
        int y;
        public Position(int x,int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
    public int orangesRotting(int[][] grid) {
        int count = 0;
        int n = grid[0].length;
        int m = grid.length;
        Queue<Position> queue = new LinkedList<>();
        HashMap<Position,Integer> depth = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 2){
                    Position position = new Position(j,i);
                    queue.offer(position);
                    depth.put(position,0);
                }
            }
        }
        while (!queue.isEmpty()){
            Position tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = tmp.getX()+dx[i];
                int y = tmp.getY()+dy[i];
                if(x >= 0 && x < n && y>=0 && y < m && grid[y][x] == 1){
                        grid[y][x] = 2;
                        Position tmp2 = new Position(x,y);
                        queue.offer(tmp2);
                        depth.put(tmp2,depth.get(tmp)+1);
                        count = depth.get(tmp2);
                }
            }
        }
        for(int[] flag:grid){
            for(int i:flag){
                if(i == 1){
                    return -1;
                }
            }
        }
        return count;
    }
}
