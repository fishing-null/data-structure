package hash.leetcode;

import java.util.*;

public class Num17 {
    public static void main(String[] args) {
        Num17 num17 = new Num17();
        num17.letterCombinations("23");

    }
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        if(digits.length() == 0){
            return ret;
        }
        Map<Character,String> phoneMap = new HashMap<Character,String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");

        }
        };
        backTrack(ret,phoneMap,digits,0,new StringBuffer());
        return ret;
    }

    private void backTrack(List<String> ret, Map<Character, String> phoneMap, String digits, int index, StringBuffer stringBuffer) {
        if(index == digits.length()){
           ret.add(stringBuffer.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                stringBuffer.append(letters.charAt(i));
                backTrack(ret, phoneMap, digits, index + 1, stringBuffer);
                stringBuffer.deleteCharAt(index);
            }
        }
    }
}
