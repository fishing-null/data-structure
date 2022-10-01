package seqList.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num118 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list = Num118.generate(7);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> row1 = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        row1.add(1);
        ret.add(row1);
        for(int i = 1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1;j <= (i-1);j++){
                List<Integer> prevRow = ret.get(i-1);
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            ret.add(row);
        }
        return ret;
    }
}
