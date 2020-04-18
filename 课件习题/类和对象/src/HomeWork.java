import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 类和对象
 * User: HHH.Y
 * Date: 2020-04-18
 */

public class HomeWork {
    public static void changeContent(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
    
    public static void main(String[] args) {
        // 给定两个整型数组, 交换两个数组的内容.
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        changeContent(array1, array2);
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));
    }

    // 给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    // 先在数组前面寻找第一个奇数, 在数组后面找第一个偶数, 然后将他们进行交换
    public static void func(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
}


