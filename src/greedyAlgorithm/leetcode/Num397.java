package greedyAlgorithm.leetcode;

public class Num397 {
    public static void main(String[] args) {

    }
    public int integerReplacement(int n) {
        int count = 0;
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
                count++;
            }else {
                if(n == 3){
                    count += 2;
                    n = 1;
                }else {
                    if(n % 4 == 1){
                        n /= 2;
                        count += 2;

                    }else if(n % 4 == 3){
                        n = (n / 2) + 1;
                        count += 2;
                    }
                }
            }
        }
        return count;
    }
}
