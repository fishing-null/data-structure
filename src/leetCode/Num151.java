package leetCode;

import java.util.Arrays;
import java.util.Collections;

public class Num151 {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
