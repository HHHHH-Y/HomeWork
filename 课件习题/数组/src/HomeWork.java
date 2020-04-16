import java.util.Arrays;
public class HomeWork {
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if(i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        // 实现一个方法toString, 把一个整形数组转换成字符串
        // 例如: 数组{1,2,3}, 返回的字符串为"[1, 2, 3]", 注意逗号的位置和数量
        int[] array = {1, 2, 3};
        System.out.println(toString(array));
        System.out.println(Arrays.toString(array));
    }


    public static int[] copyOf(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static void main4(String[] args) {
        // 实现一个copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
        int[] array = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(array));
        int[] ret = copyOf(array);
        System.out.println(Arrays.toString(ret));
        int[] tmp = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(tmp));
    }


    public static int binarySearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if(n > arr[mid]) {
                left = mid + 1;
            } else if(n < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        // 给定一个整型有序数组, 实现二分查找
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ret = binarySearch(array,7);
        System.out.println("下标是: " + ret);
        System.out.println(Arrays.binarySearch(array, 7));
    }


    public static boolean judge(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        // 给定一个整形数组, 判断该数组是否有序(递增)
        int[] array = {1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        System.out.println(judge(array));
    }


    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            // 一趟排序
            for (int j = 0; j < arr.length-1 -i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = tmp;
                    flag = true;
                }
            }
            if(flag = false) {
                break;
            }
        }
    }
    public static void main1(String[] args) {
        // 给定一个整形数组, 实现冒泡排序(升序排序)
        int[] array = {10, 9, 8 ,1, 2, 3, 4, 5, 6, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
