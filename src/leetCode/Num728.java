package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Num728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(isDividingNumbers(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isDividingNumbers(int num){
        int tmp = num;
        while (tmp>0){
            int i = tmp%10;
            if(i == 0 || num % i != 0){
                return false;
            }
            tmp/=10;
        }
        return true;
    }
}
