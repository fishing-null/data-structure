package hash.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Num343 {
    public static void main(String[] args) {
        canConstruct("aa","ab");
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(map2.containsKey(ransomNote.charAt(i))){
                if(map2.get(ransomNote.charAt(i)) > 0){
                    map2.put(ransomNote.charAt(i),map2.get(ransomNote.charAt(i))-1);
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
