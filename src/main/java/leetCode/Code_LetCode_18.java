package leetCode;

import java.util.Arrays;

public class Code_LetCode_18 {

    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     * 输入：nums = [-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 解释：平方后，数组变为 [16,1,0,9,100]
     * 排序后，数组变为 [0,1,9,16,100]
     * 示例 2：
     * 输入：nums = [-7,-3,2,3,11]
     * 输出：[4,9,9,49,121]
     */
    public static int[] sortedSquares(int[] nums) {
        int slowIndex = 0;
        int fastIndex = nums.length - 1;
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        while (slowIndex <= fastIndex) {  // 0 < 3
            int left = nums[slowIndex] * nums[slowIndex]; // 16
            int right = nums[fastIndex] * nums[fastIndex]; // 9
            if (left > right) {
                result[index--] = left;
                slowIndex++;
            } else {
                result[index--] = right;
                fastIndex--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int[] ints = sortedSquares(nums);
        System.out.println(Arrays.toString(ints));
    }
}
