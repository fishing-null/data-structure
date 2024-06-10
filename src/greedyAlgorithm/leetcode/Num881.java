package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num881 {
    public static void main(String[] args) {

    }
    public int numRescueBoats(int[] people, int limit){
        //使用count记录需要的最小船数量
        int count = 0;
        int light = 0;
        int heavy = people.length - 1;
        //对people数组进行排序
        Arrays.sort(people);
        while(light <= heavy){
            //判断重量大小,让最重的人和最轻的人同乘一条船
            if(people[light] + people[heavy] <= limit){
                //可以同乘
                ++light;
            }
            //不能同乘,让重的人单独乘坐一条船
            --heavy;
            ++count;
        }
        return count;
    }
}
