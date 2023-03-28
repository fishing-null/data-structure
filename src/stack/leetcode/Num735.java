package stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Num735 {
    public static void main(String[] args) {
        Num735 num735 = new Num735();
        num735.asteroidCollision(new int[] {1,3,4,-7,8,9});

    }
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {
            boolean flag = true;
            while (flag && asteroids[i] < 0 && !deque.isEmpty() && deque.peek() > 0) {
                flag = deque.peek() < -asteroids[i];
                if (deque.peek() <= -asteroids[i]) {
                    deque.pop();
                }
            }
            if (flag) {
                deque.push(asteroids[i]);
            }
        }
        int size = deque.size();
        int[] ret = new int[size];
        for (int i = deque.size()-1 ; i >= 0 ; i--) {
            ret[i] = deque.pop();
        }
        return ret;
    }
}
