package stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Num1475 {
    public static void main(String[] args) {

    }
    public int[] finalPrices(int[] prices) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = prices.length;
        int[] ret = new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            while (!deque.isEmpty() && deque.peek() > prices[i]){
                deque.pop();
            }
            ret[i] = deque.isEmpty() ? prices[i] : prices[i]-deque.peek();
            deque.push(prices[i]);
        }
        return ret;
    }
}
