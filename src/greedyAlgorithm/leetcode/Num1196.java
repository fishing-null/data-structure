package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num1196 {
    public static void main(String[] args) {

    }
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int count = 0;
        int total = 0;
        for (int i = 0; i < weight.length; i++) {
            total += weight[i];
            if(total <= 5000){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
