package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer58 {
    public static void main(String[] args) {

    }
    //队列法
    public String reverseLeftWords(String s, int n) {
        List<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            char aChar = queue.remove(0);
            queue.add(aChar);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(queue.get(i));
        }
        String ret = sb.toString();
        return ret;
    }
}
