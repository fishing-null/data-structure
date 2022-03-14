package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        findRestaurant(list1,list2);
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        Map<String,Integer> map3 = new HashMap<>();
        List<String> ret = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i],i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i],i);
            if(map1.containsKey(list2[i])){
                map3.put(list2[i],map1.get(list2[i])+map2.get(list2[i]));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i: map3.values()){
            if(i < min){
                min = i;
            }
        }
        for(String i: map3.keySet()){
            if(map3.get(i) == min){
                ret.add(i);
            }
        }
        return (String[])ret.toArray(new String[0]);
    }
}
