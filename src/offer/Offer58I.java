package offer;

public class Offer58I {
    public static void main(String[] args) {
        String a = "a good   example";
        reverseWords(a);
    }
    public static String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strings.length-1; i >=0 ; i--) {
            if(strings[i].equals("")){
                continue;
            }
            sb.append(strings[i]+" ");
        }
        return sb.toString().trim();
    }
}
