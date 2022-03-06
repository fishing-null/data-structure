package Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Interview1714 {
    public int[] smallestK(int[] arr, int k) {
        if(k == 0 || arr.length == 0){
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if(queue.size() < k){
                queue.offer(arr[i]);
            }else{
                int peek = queue.peek();
                if(arr[i]>peek){
                    continue;
                }else{
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll();
        }
        return ret;
    }
}
