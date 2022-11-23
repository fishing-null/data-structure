package queue.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Offer1714 {
    public static void main(String[] args) {

    }
    public int[] smallestK(int[] arr, int k) {
        if(arr.length == 0){
            return arr;
        }
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll();
        }
        return ret;
    }
}
