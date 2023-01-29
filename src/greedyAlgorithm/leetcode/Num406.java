package greedyAlgorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Num406 {
    public static void main(String[] args) {
        Num406 num406 = new Num406();
        num406.reconstructQueue(new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});

    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]){
                    return o2[0]-o1[0];
                }else {
                    return o1[1]-o2[1];
                }
            }
        });
        List<int[]> ret = new ArrayList<>();
        for(int[] preson : people){
            ret.add(preson[1],preson);
        }
        return ret.toArray(new int[ret.size()][]);
    }
}
