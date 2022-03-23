package leetCode;

public class Num58 {
    public static void main(String[] args) {
        lengthOfLastWord("Hello World");
    }
    public static int lengthOfLastWord(String s) {
        String[] ret = s.split(" ");
        String last = ret[ret.length-1];
        return last.length();
    }
}
