package array.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Num733 {
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};
    public static void main(String[] args) {

    }
    static class Position{
        int x;
        int y;
        public Position(int x,int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ini = image[sr][sc];
        if(ini == color){
            return image;
        }
        Queue<Position> queue = new LinkedList<>();
        Position position = new Position(sr,sc);
        queue.offer(position);
        int n = image.length,m = image[0].length;
        image[sr][sc] = color;
        while (!queue.isEmpty()){
            Position tmp = queue.poll();
            int x = tmp.getX(),y = tmp.getY();
            for (int i = 0; i < 4; i++) {
                int mx = x+dx[i],my = y+dy[i];
                if(mx >= 0 && mx < n && my >=0 && my < m && image[mx][my] == ini){
                    queue.offer(new Position(mx,my));
                    image[mx][my] = color;
                }
            }
        }
        return image;
    }
}
