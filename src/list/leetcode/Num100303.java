package list.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Num100303 {
    public static void main(String[] args) {
        Num100303 num100303 = new Num100303();
        num100303.occurrencesOfElement(new int[] {1,3,1,7},new int[] {1,3,2,4},1);

    }
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new LinkedList<>();
        int n = queries.length;
        int[] ret = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x){
                list.add(i);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if(queries[i] > list.size()){
                ret[i] = -1;
            }else {
                ret[i] = list.get(queries[i]-1);
            }
        }
        return ret;
    }
}
