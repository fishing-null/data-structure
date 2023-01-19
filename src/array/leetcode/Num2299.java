package array.leetcode;

import java.util.HashSet;

public class Num2299 {
    public static void main(String[] args) {
        strongPasswordCheckerII("$Aa1a1a1");
    }
    public static boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        HashSet<Character> specials = new HashSet<>();
        specials.add('!');specials.add('@');specials.add('#');specials.add('%');specials.add('^');specials.add('&');
        specials.add('*');specials.add('(');specials.add(')');specials.add('-');specials.add('+');specials.add('$');
        int length = password.length();
        boolean hasLower = false,hasUpper = false,hasDigit = false,hasSpecial = false;
        for (int i = 0; i < length; i++) {
            if (i != length - 1 && password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
            Character ch = password.charAt(i);
            if(Character.isLowerCase(ch)){
                hasLower = true;
            }else if(Character.isUpperCase(ch)){
                hasUpper = true;
            }else if(Character.isDigit(ch)){
                hasDigit = true;
            }else if(specials.contains(ch)){
                hasSpecial = true;
            }
        }
        return hasDigit && hasLower && hasSpecial && hasUpper;
    }
}
