package offer;

import java.util.ArrayDeque;
import java.util.Deque;

public class OfferII038 {
    public static void main(String[] args) {

    }
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ret = new int[length];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            while (!deque.isEmpty() && temperatures[i] > temperatures[deque.peek()]){
                int tmp = deque.pop();
                ret[tmp] = i-tmp;
            }
            deque.push(i);
        }
        return ret;
    }
}
