package array.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Num2511 {
    public static void main(String[] args) {
        Num2511 num2511 = new Num2511();
        num2511.captureForts(new int[]{1,0,0,-1,0,0,0,0,1});
        Map<Integer,Integer> map = new HashMap<>();

    }
    public int captureForts(int[] forts) {
        int count = 0;
        Stack<Integer> s = new Stack<>();
        for(int fort:forts){
            s.push(fort);
        }
        int[] reverseForts = new int[forts.length];
        for (int i = 0; i < reverseForts.length; i++) {
            reverseForts[i] = s.pop();
        }
        return Math.max(Count(forts),Count(reverseForts));
    }
    public int Count(int[] forts){
        int low = 0,fast = 1;
        int count = 0;
        while (fast < forts.length){
            if(forts[fast] == -1 && forts[low] == 1){
                count = Math.max(count,(fast-low) - 1);
                low = fast;
            }
            if(forts[fast] == 1){
                low = fast;
            }
            fast++;
        }
        return count;
    }
}
