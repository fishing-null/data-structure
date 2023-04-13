package math.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num89 {
    public static void main(String[] args) {

    }
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; i++) {
            int highBit = 1 << i;
            for (int j = list.size()-1; j >= 0 ; j--) {
                list.add(list.get(j)+highBit);
            }
        }
        return list;
    }
}
