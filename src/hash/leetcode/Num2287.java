package hash.leetcode;

import java.util.HashMap;

public class Num2287 {
    public static void main(String[] args) {
        int ret = rearrangeCharacters("abbaccaddaeea","aaaaa");
        System.out.println(ret);
    }
    public static int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        while (true) {
            for (int i = 0; i < target.length(); i++) {
                if(map.containsKey(target.charAt(i))){
                    if (map.get(target.charAt(i)) > 0) {
                        map.put(target.charAt(i),map.get(target.charAt(i))-1);
                        continue;
                    } else {
                        return count;
                    }
                }else {
                    return 0;
                }
            }
            count++;
        }
    }
}
