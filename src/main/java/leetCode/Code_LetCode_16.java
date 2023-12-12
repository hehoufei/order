package leetCode;

public class Code_LetCode_16 {


    /**
     * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
     * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
     * 不能使用任何内置的库函数，如 sqrt 。
     */

    public static boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int left = 1;
        int right = num >> 1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (middle > (num / middle)) {
                right = middle - 1;
            } else if (middle < (num / middle)) {
                left = middle + 1;
            } else {
                if (middle * middle == num) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean perfectSquare = isPerfectSquare(16);
        System.out.println(perfectSquare);
    }
}
