package leetCode;

public class Num290 {
    public static void main(String[] args) {

    }
    public boolean wordPattern(String pattern, String s) {
        String[] strPattern = pattern.split("");
        String[] strS = s.split(" ");
        if(strS.length != strPattern.length){
            return false;
        }
        for (int i = 0; i < strPattern.length; i++) {
            for (int j = i+1; j < strPattern.length; j++) {
                if(strPattern[i].equals(strPattern[j])){
                    if(strS[i].equals(strS[j])){
                        continue;
                    }else{
                        return false;
                    }
                }
                if(strS[i].equals(strS[j])){
                    if(strPattern[i].equals(strPattern[j])){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
