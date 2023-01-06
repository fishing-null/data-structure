package hash.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Num771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] ch1 = jewels.toCharArray();
        char[] ch2 = stones.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character i:ch1){
            map.put(i,0);
        }
        for(Character i:ch2){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
        }
        int count = 0;
        for(Character i: map.keySet()){
            if(map.get(i) != 0){
                count +=map.get(i);
            }
        }
        return count;
    }
}
