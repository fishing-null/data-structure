package offer;

import java.util.ArrayList;
import java.util.List;

public class Offer57II {
    public static void main(String[] args) {

    }
    public int[][] findContinuousSequence(int target) {
        if(target < 3){
            return new int[][] {};
        }
        int small = 1,big = 2,middle = (target+1)/2;
        int curSum = small + big;
        List<int[]> ret = new ArrayList<>();
        while (small < middle){
            if(curSum == target){
                ret.add(PrintContinuousSequence(small,big));
            }
            while(curSum > target && small < middle){
                curSum -= small;
                small++;
                if(curSum == target){
                    ret.add(PrintContinuousSequence(small,big));
                }
            }
            big++;
            curSum += big;
        }
        return ret.toArray(new int[ret.size()][]);
    }

    private int[] PrintContinuousSequence(int small,int big) {
        int[] tmp = new int[big-small+1];
        for (int i = small,j = 0; i <= big; i++,j++) {
            tmp[j] = i;
        }
        return tmp;
    }
}
