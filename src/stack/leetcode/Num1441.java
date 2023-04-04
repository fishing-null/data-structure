package stack.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num1441 {
    public static void main(String[] args) {
        Num1441 num1441 = new Num1441();
        num1441.buildArray(new int[] {1,3},3);

    }
    public List<String> buildArray(int[] target, int n) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        int j = 0;
        int length = target.length;
        while(i < n && j < length){
            if(i+1 == target[j]){
                ret.add("Push");
                j++;
                i++;
            }else{
                ret.add("Push");
                ret.add("Pop");
                i++;
            }

        }
        return ret;
    }
}
