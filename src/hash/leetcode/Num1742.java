package hash.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Num1742 {
    public static void main(String[] args) {
        countBalls(1,10);
    }
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = lowLimit; i < highLimit+1; i++) {
            map.put(count(i),map.getOrDefault(count(i),0)+1);
        }
        int max = 0;
        for(Integer n: map.values()){
            if(n>max){
                max = n;
            }
        }
        return max;
    }
    public static int count(int index){
        int count = 0;
        while(index>0){
            count += index%10;
            index /= 10;
        }
        return count;
    }
}
