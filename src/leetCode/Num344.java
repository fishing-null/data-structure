package leetCode;

public class Num344 {
    public static void main(String[] args) {

    }
    public void reverseString(char[] s) {
        int right = s.length;
        int left = 0;
        while(left < right){
            char tmp = s[right-1];
            s[right-1] = s[left];
            s[left] = tmp;
            left++;
            right--;
        }
    }
}
