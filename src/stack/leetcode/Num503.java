package stack.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Num503 {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret,-1);
        for (int i = 0; i < n*2 -1; i++) {
            while(!s.isEmpty() && nums[s.peek()] < nums[i%n]){
                ret[s.pop()] = nums[i%n];
            }
            s.push(i % n);
        }
        return ret;
    }
}
