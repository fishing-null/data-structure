package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Num771 {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            map.put(stones.charAt(i),1+ map.getOrDefault(stones.charAt(i),0));
        }
        int ret = 0;
        for (int i = 0; i < jewels.length(); i++) {
            if(map.containsKey(jewels.charAt(i))){
                ret += map.get(jewels.charAt(i));
            }
        }
        return ret;
    }
}
