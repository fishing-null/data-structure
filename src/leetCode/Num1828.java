package leetCode;

public class Num1828 {
    public static void main(String[] args) {

    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ret[i] = countPoints(points, queries[i]);
        }
        return ret;
    }
    public int countPoints(int[][] points,int[] queries){
        int count = 0;
        for (int i = 0; i < points.length;i++) {
            int x = Math.abs(points[i][0]-queries[0]);
            int y = Math.abs(points[i][1]-queries[1]);
            if(x*x + y*y <= queries[2]*queries[2]){
                count++;
            }
        }
        return count;
    }
}
