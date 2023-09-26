package Basics;

public class Code03_SelectSort {
    /**
     * 选择排序
     * 0~N-1上选出最小值放到0位置
     * 1~N-1上选出最小值放到1位置
     * 2~N-1上选出最小值放到2位置
     *
     **/

    private static void f01(int[] arr, int index){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[1]) {
                min = arr[i];
            }
        }
        arr[index] = min;
    }

    public static void f02(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                   min = arr[j];
                   index = j;
                }
            }
            int temp =  arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,3,7,1,0};
        f02(arr);
    }

}
