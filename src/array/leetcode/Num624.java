package array.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Num624 {
    public static void main(String[] args) {
        Num624 num624 = new Num624();
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);list1.add(5);
        List<Integer> list2 = new LinkedList<>();
        list2.add(3);list2.add(4);
        list.add(list1);list.add(list2);
        num624.maxDistance(list);

    }
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0),max = arrays.get(0).get(arrays.get(0).size()-1);
        int ret = 0;
        for (int i = 1; i < arrays.size(); i++) {
            ret = Math.max(ret,Math.max(Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min),Math.abs(max-(arrays.get(i).get(0)))));
            min = Math.min(min,arrays.get(i).get(0));
            max = Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return ret;
    }
}
