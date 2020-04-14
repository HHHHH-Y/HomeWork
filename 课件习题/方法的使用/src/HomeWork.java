import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    }


    public static void main5(String[] args) {
        // 求n的阶乘
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(mul1(n));
    }
    public static int mul1(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }


    public static void main4(String[] args) {
        // 求1! + 2! + 3! + 4! + ... + n!
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorial1(n);
    }
    public static void factorial1(int n) {
        int sum = 0;
        int ret = 1;
        for (int i = 1; i <= n ; i++) {
            ret *= i;
            sum += ret;
        }
        System.out.println(sum);
    }


    public static void main3(String[] args) {
        // 求1! + 2! + 3! + 4! + ... + n!
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorial(n);
    }
    public static void factorial(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += mul(i);
        }
        System.out.println(sum);
    }
    public static int mul (int n) {
        int ret = 1;
        for (int j = 1; j <= n ; j++) {
            ret *= j;
        }
        return ret;
    }



    public static void main2(String[] args) {
        // 用迭代的方式求斐波那契数列的第n项
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }



    // 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static void main1(String[] args) {
        int[] array = {1, 1, 3, 5, 7, 3 ,6, 7, 5};
        // 对数组中的每个元素都进行遍历, 求它出现的次数
        findOwn(array);
    }
    public static void findOwn(int[] arr) {
        int i = 0;
        for (i = 0; i < arr.length ; i++) {
            int count = 0;
            int j = 0;
            for (j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
                if(count == 2) {
                    break;
                }
            }
            if(j == arr.length) {
                System.out.println(arr[i]+ ", 它的下标为 : " + i);
            }
        }
    }
}
