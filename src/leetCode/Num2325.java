package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Num2325 {
    public static void main(String[] args) {

    }
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int k = 0;
        for (int i = 0; i < key.length(); i++) {
            if(map.containsKey(key.charAt(i)) || key.charAt(i) == ' '){
                continue;
            }else {
                map.put(key.charAt(i),(char)('a'+k));
                k++;
            }
        }
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                ret.append(' ');
                continue;
            }
            ret.append(map.get(message.charAt(i)));
        }
        return ret.toString();
    }
}
