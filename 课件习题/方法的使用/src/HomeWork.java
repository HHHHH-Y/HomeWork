import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // 递归求n的阶乘
        System.out.println(func(5));
    }
    public static int func(int n) {
        if(n == 1) {
            return 1;
        }
        return n * func(n - 1);
    }


    public static void main13(String[] args) {
        // 递归求和 1 + 2 + 3 + ... + 10
        System.out.println(sum1(10));
    }
    public static int sum1(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum1(n - 1);
    }


    public static void main12(String[] args) {
        // 用递归的方式按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
        print(1234);
    }
    public static void print(int n) {
        if(n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }


    public static void main11(String[] args) {
        // 写一个递归方法，输入一个非负整数，返回组成它的数字之和
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if(n < 10) {
            return n % 10;
        }
        return ((n % 10) + sum(n / 10));
    }



    public static void main10(String[] args) {
        // 递归求斐波那契数列第N项
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fabonacci1(n));
    }
    public static int fabonacci1(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return fabonacci1(n - 1) + fabonacci1(n - 2);
        }
    }


    public static void main9(String[] args) {
        // 在同一个类中,分别定义求两个整数的方法和三个小数之和的方法。并执行代码，求出结果
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(add(num1, num2));
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        System.out.println(add(n1, n2, n3));
    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static void main8(String[] args) {
        // 在同一个类中定义多个方法(方法的重载)
        // 要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
        int a = 10;
        int b = 20;
        System.out.println(max(a, b)); // 20
        double d1 = 3.14;
        double d2 = 5.12;
        System.out.println(max(d1, d2)); // 5.12
        double d3 = 8.88;
        double d4 = 6.66;
        int c = 5;
        System.out.println(max(d3, d4, c)); // 8
    }
    public static int max(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }
    public static double max(double num1, double num2) {
        return (num1 > num2 ? num1 : num2);
    }
    public static int max(double num1, double num2, int num3) {
        return ((int)max(num1, num2) > num3 ? (int)max(num1, num2) : num3);
    }


    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max2(a, b));
        System.out.println(max3(a, b, c));
    }
    public static int max2(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }
    public static int max3(int num1, int num2, int num3) {
        return max2(max2(num1, num2), num3);
    }


    public static void main6(String[] args) {
        // 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        int[] array =  {1, 3, 2, 7, 6, 4, 5, 9, 10};
        int[] ret = adjust(array);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] adjust(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            while(left < right && arr[left] % 2 != 0) {
                left++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return arr;
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
