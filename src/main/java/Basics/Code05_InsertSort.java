package Basics;

import static commonutils.CommonUtils.printArray;
import static commonutils.CommonUtils.swap;

public class Code05_InsertSort {

    public static void insertSort(int[] arr){
        // 0-i上是有序的
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 && arr[j] > arr[j+1] ; j--) {
                swap(arr, j ,j+1);
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
//        int[] arr = generateArray(10, 10);
        int[] arr = {7, 6, 5, -5, 1, -4, 8, -2, 4};
        System.out.println();
        insertSort(arr);

    }

}
