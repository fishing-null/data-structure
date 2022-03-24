package myBinTree.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] ret = new int[k];
        for (int i = 0; i < arr.length; i++) {
                queue.offer(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll();
        }
        return ret;
    }
}
