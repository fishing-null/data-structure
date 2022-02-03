package nowcoder;

import java.util.HashMap;
import java.util.Map;

public class Nc31 {
    public class Solution {
        public int FirstNotRepeatingChar(String str) {
            Map<Character,Integer> map = new HashMap<>();
            char[] s = str.toCharArray();
            for(char ch:s){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }
            for (int i = 0; i < s.length; i++) {
                if(map.get(s[i]) == 1){
                    return i;
                }
            }
            return -1;
        }
    }
}
