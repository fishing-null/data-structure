package array.leetcode;

public class Num419 {
    int[] dx = new int[]{0,0,1,-1};
    int[] dy = new int[]{1,-1,0,0};
    public class Pair{
        int x,y;
        public Pair(int x,int y){
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
    public static void main(String[] args) {
        

    }
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int ret = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'X'){
                    for (int k = j+1; k < n && board[i][k] == 'X'; k++) {
                        board[i][k] = '.';
                    }
                    for (int k = i+1; k < n && board[k][j] == 'X'; k++) {
                        board[k][j] = '.';
                    }
                    ret++;
                }
            }
        }
        return ret;
    }
}
