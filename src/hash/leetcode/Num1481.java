package hash.leetcode;

import java.util.*;

public class Num1481 {
    public static void main(String[] args) {

    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            int count = map.getOrDefault(num,0) + 1;
            map.put(num,count);
        }
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int[] tmp = {entry.getKey(),entry.getValue()};
            list.add(tmp);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int ret = list.size();
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i)[1];
            if(k >= min){
                ret--;
                k -= min;
            }else{
                break;
            }
        }
        return ret;
    }

}
