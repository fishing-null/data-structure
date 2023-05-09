package greedyAlgorithm.leetcode;

import queue.LoopQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Num649 {
    public static void main(String[] args) {

    }
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            }else{
                dire.offer(i);
            }
        }
        int length = senate.length();
    while(!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.remove();
            int d = dire.remove();
            if(r < d){
                radiant.offer(length+r);
            }else{
                dire.offer(length+d);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
