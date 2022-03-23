package offer;

public class Offer05 {
    public String replaceSpace(String s) {
        //return s.replace(" ","%20");
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' '){
                sb.append("%20");
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
