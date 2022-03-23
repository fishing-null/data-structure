package offer;

public class Offer58 {
    public static void main(String[] args) {

    }
    //队列法
    public String reverseLeftWords(String s, int n) {
//        List<Character> queue = new LinkedList<>();
//        for (int i = 0; i < s.length(); i++) {
//            queue.add(s.charAt(i));
//        }
//        for (int i = 0; i < n; i++) {
//            char aChar = queue.remove(0);
//            queue.add(aChar);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            sb.append(queue.get(i));
//        }
//        String ret = sb.toString();
//        return ret;
        if(s.length() == 1){
            return s;
        }
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,s.length());
        String ret = s2.concat(s1);
        return ret;
    }

}
