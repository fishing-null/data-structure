package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Num2309 {
    public static void main(String[] args) {

    }
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            set.add(c);
        }
        for (int i = 25; i >= 0 ; i--) {
            if(set.contains((char)('a'+i)) && set.contains((char)('A'+i))){
                return String.valueOf((char)('A'+i));
            }
        }
        return "";
    }
}
