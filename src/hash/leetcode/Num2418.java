package hash.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Num2418 {
    public static void main(String[] args) {

    }
    public class Pair{
        String name;
        int height;
        public Pair(String name,int height){
            this.name = name;
            this.height = height;
        }

    }

    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<>(Comparator.comparingInt(Integer::intValue).reversed());
        for (int n = 0; n < names.length; n++) {
            map.put(heights[n],names[n]);
        }
        return map.values().toArray(new String[names.length]);
    }
}
