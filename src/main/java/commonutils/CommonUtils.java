package commonutils;

import java.util.Random;

public class CommonUtils {

    public static int[] generateArray(int maxSize,int maxValue){
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue - 1) * Math.random());
        }
        printArray(arr);
        return arr;
    }

    public static void printArray(int[] arr){
        if (arr != null) {
            for (int i : arr) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = generateArray(10, 10);
        printArray(array);
    }



}
