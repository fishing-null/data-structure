package stack.leetcode;

import java.util.LinkedList;

public class Num739 {
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<Integer> stack = new LinkedList<>();
        int[] ret = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int temp = stack.pop();
                ret[temp] = i-temp;
            }
            stack.push(i);
        }
        return ret;
    }
}
