import java.util.HashSet;
import java.util.Set;

public class Num10313 {
    public static void main(String[] args) {
        Num10313 num10313 = new Num10313();
        num10313.queryResults(1,new int[][] {{0,1},{1,4},{1,1},{1,4},{1,1}});

    }
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] ball = new int[limit+1];
        int[] ret = new int[n];
        Set<Integer> tmpSet = new HashSet<>();
        for (int i = 0; i < queries.length; i++) {
            tmpSet.remove(ball[queries[i][0]]);
            ball[queries[i][0]] = queries[i][1];
            if(ball[queries[i][0]] != 0){
                tmpSet.add(ball[queries[i][0]]);
            }
            ret[i] = tmpSet.size();
        }
        return ret;
    }
}
