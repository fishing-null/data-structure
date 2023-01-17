package leetCode;

import java.util.HashMap;

public class Num567 {
    public static void main(String[] args) {

    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        int left = 0,right = s1.length()-1;
        while(right < s2.length()){
            HashMap<Character,Integer> map2 = new HashMap<>();
            for (int i = left; i <= right; i++) {
                map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            }
            if(map1.equals(map2)){
                return true;
            }else{
                right++;
                left++;
            }
        }
        return false;
    }
}
