package demo;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现方法replace, 能够替换字符串中的某个部分
 * User: HHH.Y
 * Date: 2020-05-09
 */

/**
 * ababcabcd
 * ppppcppcd
 */
public class TestDemo1 {
    public static String replace(String str, char s1, char s2) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == s1) {
                chars[i] = s2;
            }
        }
        String ret = new String(chars);
        return ret;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char be = scanner.next().charAt(0);
        char ch = scanner.next().charAt(0);
        String ret = replace(str, be, ch);
        System.out.println(ret);
    }
}
