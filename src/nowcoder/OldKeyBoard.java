package nowcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class OldKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 期望输入的
        String expectedStr = null;
        // 实际输入的
        String actualStr = null;
        while (scanner.hasNext()) {
            expectedStr = scanner.next();
            actualStr = scanner.next();
        }
        // 输出是全大写的，将输入的字符串转为大写处理
        expectedStr = expectedStr.toUpperCase();
        actualStr = actualStr.toUpperCase();
        // 遍历实际输入的字符串，使用Set集合存储不重复的字符
        Set<Character> actualSet = new HashSet<>();
        for (int i = 0;i < actualStr.length();i++) {
            actualSet.add(actualStr.charAt(i));
        }
        // 拿着实际输入的Set集合来遍历期望输入的字符串
        // 坏键就是期望有，但是实际没有的字符
        // 再用一个Set来去重，去的是实际字符串中重复的元素
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < expectedStr.length(); i++) {
            char c = expectedStr.charAt(i);
            // 坏键就是期望中有，但是实际中没有的
            if (!actualSet.contains(c)) {
                // 去重
                if (set.add(c)) {
                    // c确实是期望中有，但是实际中没有的，而且是第一次出现的
                    System.out.print(c);
                }
            }
        }
        System.out.println();
    }
}