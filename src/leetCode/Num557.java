package leetCode;

public class Num557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        int length = s.length();
        StringBuffer sb = new StringBuffer();
        int fast = 0;
        while(fast < length){
            int low = fast;
            while(fast < length && s.charAt(fast) != ' '){
                fast++;
            }
            for (int i = fast-1; i >= low; i--) {
                sb.append(s.charAt(i));
            }
            while(fast < length && s.charAt(fast) == ' '){
                fast++;
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
