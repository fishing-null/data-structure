package glideWindow.leetcode;

import java.util.HashMap;

public class Num904 {
    public static void main(String[] args) {

    }
    public int totalFruit(int[] fruits) {
        //用map代表篮子,key代表水果类型,value代表数量
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0,right = 0;
        int ret = Integer.MIN_VALUE;
        while(right < fruits.length){
            //入窗口
            map.put(fruits[right],map.getOrDefault(fruits[right],0) + 1);
            //篮子的数量大于两个了,出窗口
            while (map.size() > 2){
                map.put(fruits[left],map.get(fruits[left]) - 1);
                //移除篮子
                if(map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }
            //更新结
            ret = Math.max(ret,right - left + 1);
            right++;
        }
        return ret;
    }
}
