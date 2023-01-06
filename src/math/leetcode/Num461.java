package math.leetcode;

public class Num461 {
    public static void main(String[] args) {

    }
    public int hammingDistance(int x, int y) {
        int num = x^y;
        return countOne(num);
    }
    public int countOne(int num){
        int count = 0;
        while(num>0){
            num &= (num-1);
            count++;
        }
        return count;
    }
}
