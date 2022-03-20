package hash.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Num13 {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] ch = s.toCharArray();
        int ret = 0;
        for (int i = 0; i < ch.length-1; i++) {
            if(map.get(ch[i]) < map.get(ch[i+1])){
                ret -= map.get(ch[i]);
            }else{
                ret += map.get(ch[i]);
            }
        }
        ret += map.get(ch[ch.length-1]);
        return ret;
    }
}
