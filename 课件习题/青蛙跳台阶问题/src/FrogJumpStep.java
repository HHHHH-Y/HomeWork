public class FrogJumpStep {
    // 青蛙跳台阶问题
    // 一只青蛙一次可以跳1级台阶, 也可以跳2级台阶, 跳上n级台阶总共有多少种跳法?

    public static int jump(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }
        return jump(n - 1) + jump(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(jump(5));
    }
}
