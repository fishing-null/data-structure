package leetCode;

public class Num2185 {
    public static void main(String[] args) {
        String[] s1 = {"pay","attention","practice","attend"};
        String s2 = "at";
        prefixCount(s1,s2);
    }
    public static int prefixCount(String[] words, String pref) {
        int length = pref.length();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < length){
                continue;
            }
            String tmp = words[i].substring(0,length);
            if(tmp.equals(pref)){
                count++;
            }
        }
        return count;
    }
}
