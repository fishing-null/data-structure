package hash.leetcode;

import java.sql.Connection;
import java.util.*;

public class Num692 {
    public static void main(String[] args) {

    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> rec = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            rec.add(entry.getKey());
        }

        Collections.sort(rec, new Comparator<String>() {
            @Override
            //如果出现频率相同 则按照字典序排序 否则降序排序
            public int compare(String o1, String o2) {
                return map.get(o1) == map.get(o2) ? o1.compareTo(o2):map.get(o2)-map.get(o1);
            }
        });
        return rec.subList(0,k);
    }
}
