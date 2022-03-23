package leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Num1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }) ;
        for(int weight:stones){
            queue.offer(weight);
        }
        while(queue.size()>1){
            int weight1 = queue.poll();
            int weight2 = queue.poll();
            queue.offer(Math.abs(weight1-weight2));
        }
        return queue.poll();
    }
}
