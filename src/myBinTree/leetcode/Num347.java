package myBinTree.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Num347 {
    //构建一个Freq类来存储元素key与其出现次数times
    private class Freq implements Comparable<Freq>{
        private int key;
        private int times;
        public Freq(int key,int times){
            this.key = key;
            this.times = times;
        }
        //实现比较方法
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
        //queue中的每个对象属于Freq类,同时保存key及其出现次数times
        PriorityQueue<Freq> queue = new PriorityQueue<>();
        //遍历map,找出前k个高的频率存储到queue中
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            //先随便挑选k个对象入队
            if(queue.size()<k){
                queue.offer(new Freq(entry.getKey(),entry.getValue()));
            }else{
                //比较times,times大于堆顶元素的times则入队,同时堆顶元素出队保证整个队列中只有k个元素
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
