package stack.leetcode;

import java.util.*;

public class Num6022 {
    public int halveArray(int[] nums) {
        double sum = 0;//sum用来记录数组和
        if(nums.length == 1){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //传入比较器 将默认的最小堆改造为最大堆
        Queue<Double> list = new PriorityQueue<>(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2-o1>0?1:-1;
            }
        });
        //依次向队列中添加元素
        for (int i = 0; i < nums.length; i++) {
            list.add((double)nums[i]);
        }
        double ret = 0;//ret用来记录数组总的减小量
        double max = 0;
        int count = 0;
        while(ret<sum/2){
            //每次取队列中最大元素的一半 将其弹出 然后将最大元素的一半重新入队
            max = list.poll();
            ret += max/2;
            list.add(max/2);
            count ++;
        }
        return count;
    }
}
