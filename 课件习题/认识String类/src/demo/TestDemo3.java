package demo;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现方法contains, 能够判定字符串中是否包含子串
 * User: HHH.Y
 * Date: 2020-05-09
 */
public class TestDemo3 {
    public static boolean contains(String str, String strOf) {
        // 将字符串, 子串全部转成字符数组
        char[] chars = str.toCharArray();
        char[] ch = strOf.toCharArray();
        // 遍历字符串的字符数组, 找到和子串第一个字符匹配的位置i
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ch[0]) {
                // 用 k 记录下匹配上的第一个位置i
                int k = i ;
                // 计算出从 k 到最后一个字符之间的长度len
                int len = 0;
                for (int x = k; x < chars.length; x++) {
                    len++;
                }
                // count为子串的长度
                int count = ch.length;
                // 用 len 和 count 进行比较, 如果子串的长度大于字符串中子串应有的长度, 就返回-1
                if(count > len) {
                    break;
                }
                int j = 0;
                // 然后字符串中从和子串相匹配的第一个位置进行比较
                while(j < count) {
                    // 只要有一个字符不同, 就返回, 继续从字符串中 i 的下一个位置进行比较
                    if(chars[k] != ch[j]) {
                        break;
                    }
                    k++;
                    j++;
                }
                // 如果将子串比较完 全部相等, 就返回字符串中的下标
                if(j == count) {
                    return true;
                }
            }
        }
        // 如果字符串全部遍历完之后还没有找到, 就返回 -1
        return false;
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String strOf = "acd";
        System.out.println(contains(str, strOf));
    }
}
