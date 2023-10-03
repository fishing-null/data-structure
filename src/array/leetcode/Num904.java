package array.leetcode;

import java.util.HashMap;

public class Num904 {
    public static void main(String[] args) {

    }
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        int ret = 0;
        for (int left = 0,right = 0;right < fruits.length;right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0) + 1);
            while (map.size() > 2){
                map.put(fruits[left],map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }
            ret = Math.max(ret,right - left + 1);
        }
        return ret;
    }
}
