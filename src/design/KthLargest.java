package design;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for(int x:nums){
            add(x);
        }
    }

    public int add(int val) {
        //在插入队列前,检查队列长度,保证元素数量不大于k个
        pq.offer(val);
        if(pq.size() > k){
            //移除队列尾部的元素
            pq.poll();
        }
        return pq.peek();
    }
}
