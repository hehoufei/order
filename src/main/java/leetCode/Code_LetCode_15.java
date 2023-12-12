package leetCode;

public class Code_LetCode_15 {

    /**
     * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
     * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
     * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
     */
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int mid;
        int left = 1;
        int right = x / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (mid > (x / mid)) {
                right = mid - 1;
            } else if (mid < (x / mid)) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int i = mySqrt(4);
        System.out.println(i);
    }
}
