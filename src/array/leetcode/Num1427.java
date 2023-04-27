package array.leetcode;

public class Num1427 {
    public static void main(String[] args) {

    }
    public String stringShift(String s, int[][] shift) {
        int offset = 0;
        for (int i = 0; i < shift.length; i++) {
            if(shift[i][0] == 1){
                offset += shift[i][1];
            }else{
                offset -= shift[i][1];
            }
        }
        offset = offset % s.length();
        if(offset > 0){
            String subString1 = s.substring(s.length()-offset,s.length());
            String subString2 = s.substring(0,s.length()-offset);
            s = subString1+subString2;
        }else if (offset == 0){
            return s;
        }else{
            offset = Math.abs(offset);
            String subString1 = s.substring(0,offset);
            String subString2 = s.substring(offset,s.length());
            s = subString2 + subString1;
        }
        return s;
    }
}
