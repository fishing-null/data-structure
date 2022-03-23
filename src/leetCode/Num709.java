package leetCode;

public class Num709 {
    //1.
//    public String toLowerCase(String s) {
//        return s.toLowerCase();
//    }
    //2.
    public String toLowerCase(String s) {
        if(s == null){
            return null;
        }
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(ch[i]>='A' && ch[i] <='Z'){
                sb.append((char)(ch[i]+32));
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
