package offer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer13 {
    public static void main(String[] args) {
        Offer13 offer13 = new Offer13();
        offer13.movingCount(6,6,2);

    }
    int[] dx = {0,0,-1,1};
    int[] dy = {1,-1,0,0};
    public class Position {
        int x, y;

        public Position(int x, int y) {
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
    public int movingCount(int m, int n, int k) {
        if(k == 0){
            return 1;
        }
        int count = 0;
        Position position = new Position(m,n);
        Queue<Position> queue = new LinkedList<>();
        boolean[][] flag = new boolean[m][n];
        queue.offer(new Position(0,0));
        while (!queue.isEmpty()){
            Position tmp = queue.poll();
            int x = tmp.getX(),y = tmp.getY();
            for (int i = 0; i < 4; i++) {
                int tx = x+dx[i], ty = y+dy[i];
                if(tx < 0 || tx >= m || ty < 0 || ty >= n || get(tx)+get(ty) > k || flag[tx][ty]){
                    continue;
                }
                queue.offer(new Position(tx,ty));
                flag[tx][ty] = true;
                count++;
            }
        }
        return count;
    }
    private int get(int x){
        int ret = 0;
        while(x != 0){
            ret += x%10;
            x /= 10;
        }
        return ret;
    }
}
