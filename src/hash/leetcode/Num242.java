package hash.leetcode;

import java.util.HashMap;

public class Num242 {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(map1.containsKey(t.charAt(i))){
                if(map1.get(t.charAt(i)) > 0){
                    map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
                }else{
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
