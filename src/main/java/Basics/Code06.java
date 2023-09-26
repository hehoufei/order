package Basics;

public class Code06 {

    // 有序数组中找到num
    
    public static int findNum(int[] arr, int target){
        int length = arr.length;
        return  findNum1(0, length, target, arr);
    }

    public static int findNum1(int left, int right, int target, int[] arr){
        if (left > right) {
            return -1;
        }
        int half = (left + right) / 2;
        if (arr[half] == target) {
            return half;
        }
        if (arr[half] > target) {
            right = half;
        }
        if (arr[half] < target) {
            left = half;
        }
        return findNum1(left, right, target, arr);
    }

    public static void main(String[] args) {
        int[] arr = {-5, -4, -2, 1, 4, 5, 6, 7, 8};
        int num = findNum(arr, 8);
        System.out.println(num);
    }

}
