package demo;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现方法compareTo, 能够实现按照字典序比较字符串的大小
 * User: HHH.Y
 * Date: 2020-05-09
 */
public class TestDemo4 {
    public static int compareTo(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] ch = str2.toCharArray();
        // 分别计算出两个字符串的长度
        int count = chars.length;
        int size = ch.length;
        int i = 0;
        // 如果第一个字符串的长度 > 第二个字符串的长度
        while(i < count) {
            // 只要有一个字符不相等, 就返回他们之间的差值
            if(chars[i] != ch[i]) {
                return chars[i] - ch[i];
            }
            i++;
        }
        // 遍历完了第一个字符串的长度, 并且两个字符串的字符在第一个字符串的长度下完全相等
        // 如果第二个字符串比第一个字符串长度长, 就返回他们长度的差值
        if(count != size) {
            return count - size;
        }
        // 否则两个字符串的长度相等, 返回0
        return 0;
    }
    public static void main(String[] args) {
        String str1 = "defghij";
        String str2 = "abc";
        System.out.println(compareTo(str1, str2));
    }
}
