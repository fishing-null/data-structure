package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Num118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>(i+1);
            for (int j = 0; j < i+1; j++) {
                if(j == 0 || j == i){
                    temp.add(1);
                }else{
                    temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
