package stack.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Num835 {
    public static void main(String[] args) {

    }

    public class Car{
        int pos;
        int v;
        public Car(int pos,int v){
            this.pos = pos;
            this.v = v;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i],speed[i]);
        }
        Arrays.sort(cars,(a,b)-> a.pos > b.pos ? -1:1);
        Deque<Double> stack = new ArrayDeque<>();
        for (int i = 0; i < cars.length; i++) {
            double t = (target-cars[i].pos)*1.0d / cars[i].v;
            if(!stack.isEmpty() && stack.peek() >= t){
                continue;
            }else{
                stack.push(t);
            }
        }
        return stack.size();
    }
}
