package demo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现方法split, 能够指定分割符, 将字符串拆分成字符串数组(不必支持正则表达式)
 * User: HHH.Y
 * Date: 2020-05-09
 */
public class TestDemo {
    public static String[] split(String str) {
        Scanner scanner = new Scanner(System.in);
        // 输入分割符
        char simple = scanner.next().charAt(0);


    }

    public static void main(String[] args) {
        String str = "abc def ghi";
        String[] ret =  split(str);
        for (String s:ret) {
            System.out.println(s);
        }
    }
}
