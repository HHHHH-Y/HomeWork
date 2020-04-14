import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        // 创建一个int类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] array = new int[100];
        func(array);
    }
    public static void func(int[] arr) {
        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main4(String[] args) {
        // 实现一个方法printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(array);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    public static void main3(String[] args) {
        // 实现一个方法 transform,
        // 以数组为参数, 循环将数组中的每个元素乘以2, 并设置到对应的数组元素上.
        // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));
        transform(array);
    }

    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main2(String[] args) {
        // 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sum(array));
    }

    public static int sum(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        return ret;
    }


    public static void main1(String[] args) {
        // 实现一个方法avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(avg(array));
    }

    public static double avg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (double) arr[i];
        }
        double ret = 0;
        ret = sum / arr.length;
        return ret;
    }
}
