package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Num242 {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        for(char ch:s.toCharArray()){
            mapS.put(ch,mapS.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            mapS.put(ch,mapS.getOrDefault(ch,0)-1);
        }
        for(char ch:mapS.keySet()){
            if(mapS.get(ch) != 0){
                return false;
            }
        }
        return true;
    }
}
