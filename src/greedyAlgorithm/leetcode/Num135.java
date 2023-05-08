package greedyAlgorithm.leetcode;

public class Num135 {
    public static void main(String[] args) {
        Num135 num135 = new Num135();
        num135.candy(new int[] {1,2,2,5,4,3,2});

    }
    public int candy(int[] ratings) {
        int length = ratings.length;
        int[] candyCountOne = new int[length];
        int[] candyCountTwo = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            candyCountOne[i] = 1;
            candyCountTwo[i] = 1;
        }
        for (int i = 0; i < length-1; i++) {
            if(ratings[i+1] > ratings[i]){
                candyCountOne[i+1] += candyCountOne[i];
            }
        }
        for (int i = length-1; i >= 1 ; i--) {
            if(ratings[i-1] > ratings[i]){
                candyCountTwo[i-1] += candyCountTwo[i];
            }
        }
        for (int i = 0; i < length; i++) {
            candyCountOne[i] = Math.max(candyCountOne[i],candyCountTwo[i]);
            count += candyCountOne[i];
        }
        return count;
    }
}
