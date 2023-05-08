package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num1710 {
    public static void main(String[] args) {

    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ret = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int numOfBox = boxTypes[i][0];
            int numUnitsOfBox = boxTypes[i][1];
            if(numOfBox < truckSize){
                ret += numOfBox*numUnitsOfBox;
                truckSize -= numOfBox;
            }else{
                ret += truckSize * numUnitsOfBox;
                break;
            }
        }
        return ret;
    }
}
