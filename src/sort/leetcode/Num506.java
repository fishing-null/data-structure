package sort.leetcode;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Num506 {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < score.length; i++) {
            queue.offer(score[i]);
        }
        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            if(i == 0){
                map.put(queue.poll(), "Gold Medal");
                continue;
            }
            if(i == 1){
                map.put(queue.poll(), "Silver Medal");
                continue;
            }
            if(i == 2){
                map.put(queue.poll(), "Bronze Medal");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i+1);
            map.put(queue.poll(), sb.toString());
        }
        String[] ret = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            ret[i] = map.get(score[i]);
        }
        return ret;
    }
}
