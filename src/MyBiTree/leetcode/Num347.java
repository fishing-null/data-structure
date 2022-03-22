package MyBiTree.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Num347 {
    private class Freq implements Comparable<Freq>{
        private int key;
        private int times;
        public Freq(int key,int times){
            this.key = key;
            this.times = times;
        }
        @Override
        public int compareTo(Freq o) {
            return this.times-o.times;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1+ map.getOrDefault(nums[i],0));
        }
        PriorityQueue<Freq> queue = new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(queue.size()<k){
                queue.offer(new Freq(entry.getKey(),entry.getValue()));
            }else{
                if(entry.getValue() > queue.peek().times){
                    queue.poll();
                    queue.offer(new Freq(entry.getKey(),entry.getValue()));
                }else{
                    continue;
                }
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll().key;
        }
        return ret;
    }
}
