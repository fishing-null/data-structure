package array.leetcode;

public class Num2432 {
    public static void main(String[] args) {
        Num2432 num2432 = new Num2432();
        num2432.hardestWorker(19,new int[][] {{0,3},{2,5},{0,9},{1,15}});

    }
    public int hardestWorker(int n, int[][] logs) {
        int[] ret = new int[] {-1,-1};
        int[][] tmp = new int[logs.length][2];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i][0] = logs[i][0];
            if(i == 0){
                tmp[i][1] = logs[i][1] - 0;
                continue;
            }
            tmp[i][1] = logs[i][1]-logs[i-1][1];
        }
        for (int i = 0; i < tmp.length; i++) {
            if(tmp[i][1] > ret[1]){
                ret[0] = tmp[i][0];
                ret[1] = tmp[i][1];
            }
            if(tmp[i][1] == ret[1] && tmp[i][0] <= ret[0]){
                ret[0] = tmp[i][0];
            }
        }
        return ret[0];
    }
}
