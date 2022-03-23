package leetCode;

public class Num14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        char[] ch1 = strs[0].toCharArray();
        char[] ch2 = strs[1].toCharArray();
        for (int j = 0; j < Math.min(ch1.length, ch2.length); j++) {
            if (ch1[j] == ch2[j]) {
                sb.append(ch1[j]);
            }
        }
        String s = sb.toString();
        for (int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(s)){
                if(s == ""){
                    return"";
                }else{
                    s = s.substring(0,s.length()-1);
                }
            }
        }
        return s;
    }
}
