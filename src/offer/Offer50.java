package offer;

import java.util.*;

public class Offer50 {
    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),1+map.getOrDefault(s.charAt(i),0));
        }
        for(char ch: map.keySet()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return ' ';
    }
}
