package temp;

import java.util.Arrays;

public class Test03 {

    public static void main(String[] args) {
        int[] arr = {1,4,8,5,2,7,6,3,9};
        function03(arr);
    }

    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }

    // 冒泡
    public static void function01(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array[i], array[j]);
                }
            }
        }
        System.out.println("array = " + Arrays.toString(array));
    }

    // 选择：每次刷选最小值
    public static void function02(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int min = array[i];
            int x = i;
            for (int j = i+1 ; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    x = j;
                }
            }
            int t = array[i];
            array[i] = array[x];
            array[x] = t;
        }
        System.out.println("array = " + Arrays.toString(array));
    }

    // 插入排序
    public static void function03(int[] array) {
        for (int i = 1; i < array.length ; i++) {
            for (int j = i-1 ; j >= 0; j--) {
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                } else {
                    break;
                }
            }
        }
        System.out.println("array = " + Arrays.toString(array));
    }

    // 快速排序
    public static void function04(int[] array) {
//        quickSort(array, )
        System.out.println("array = " + Arrays.toString(array));
    }

    public static void quick(int[] array, int start, int left){

    }

}
