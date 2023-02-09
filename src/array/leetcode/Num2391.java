package array.leetcode;

public class Num2391 {
    public static void main(String[] args) {

    }
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] prefixSum = new int[travel.length+1];
        for (int i = 0; i < travel.length; i++) {
            prefixSum[i+1] = prefixSum[i]+travel[i];
        }
        int ret = 0,M = 0,P = 0,G = 0;
        ret += garbage[0].length();
        for (int i = 1; i < garbage.length; i++) {
            ret += garbage[i].length();
            if(garbage[i].contains("M")){
                ret += prefixSum[i] - prefixSum[M];
                M = i;
            }
            if(garbage[i].contains("P")){
                ret += prefixSum[i] - prefixSum[P];
                P = i;
            }
            if(garbage[i].contains("G")){
                ret += prefixSum[i] - prefixSum[G];
                G = i;
            }
        }
        return ret;
    }
}
