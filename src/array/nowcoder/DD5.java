package array.nowcoder;
import java.util.Scanner;
public class DD5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean flag = false;
        String table = "0123456789ABCDEF";
        if(m == 0){
            System.out.println("0");
        }
        if (m < 0) {
            m = -m;
            flag = true;
        }
        StringBuilder sb = new StringBuilder();
        while (m != 0) {
            sb.append(table.charAt(m % n));
            m = m / n;
        }
        if (flag == true) {
            sb.append("-");
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
