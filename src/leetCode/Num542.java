package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Num542 {
    public static void main(String[] args) {
        Num542 num542 = new Num542();
        int[] r1 = {0,0,0};
        int[] r2 = {0,1,0};
        int[] r3 = {1,1,1};
        int[][] matrix = {r1,r2,r3};
        num542.updateMatrix(matrix);
        System.out.println("hello");
    }
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        public class Position{
            int x,y;
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

        public int[][] updateMatrix(int[][] mat) {
            int m = mat.length,n = mat[0].length;
            int count = 0;
            boolean[][] flag = new boolean[m][n];
            Queue<Position> positionList = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(mat[i][j] == 0) {
                        Position tmp = new Position(i, j);
                        positionList.add(tmp);
                        flag[i][j] = true;
                    }
                }
            }
            while (!positionList.isEmpty()){
                Position tmp = positionList.poll();
                int x1 = tmp.getX();int y1 = tmp.getY();
                for (int i = 0; i < 4; i++) {
                    int x = x1+dx[i];int y = y1+dy[i];
                    if( x >= 0 && x < m && y >= 0 && y < n && !flag[x][y]){
                        mat[x][y] = mat[x1][y1]+1;
                        flag[x][y] = true;
                        Position tmp2 = new Position(x,y);
                        positionList.add(tmp2);
                    }
                }
            }
            return mat;
        }
}
