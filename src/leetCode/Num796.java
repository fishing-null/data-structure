package leetCode;

public class Num796 {
    class Solution {
        public boolean rotateString(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }
            s += s;
            return s.contains(goal)?true:false;
        }
    }
}
