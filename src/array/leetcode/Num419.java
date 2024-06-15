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
                //遍历矩阵,查找为'X'的元素
                if(board[i][j] == 'X'){
                    //将横排的元素清除
                    for (int k = j+1; k < n && board[i][k] == 'X'; k++) {
                        board[i][k] = '.';
                    }
                    //将纵列的元素清除
                    for (int k = i+1; k < m && board[k][j] == 'X'; k++) {
                        board[k][j] = '.';
                    }
                    //战舰数量加一
                    ret++;
                }
            }
        }
        return ret;
    }
}
