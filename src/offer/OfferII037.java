package offer;

import java.util.ArrayDeque;
import java.util.Deque;

public class OfferII037 {
    public static void main(String[] args) {
        OfferII037 offerII037 = new OfferII037();
        offerII037.asteroidCollision(new int[] {-2,3});

    }
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int aster:asteroids){
            boolean alive = true;
            while(alive && aster < 0 && !deque.isEmpty() && deque.peek() > 0){
                alive = deque.peek() < -aster;
                if(deque.peek() <= -aster){
                    deque.pop();
                }
            }
            if(alive){
                deque.push(aster);
            }
        }
        int size = deque.size();
        int[] ret = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ret[i] = deque.pop();
        }
        return ret;
    }

}
