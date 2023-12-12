package leetCode;

import java.util.Arrays;

public class Code_LetCode_14 {


    /**
     * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
     */

    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int[] ints = null;
        int leftIndex = 0;
        int rightIndex = 0;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                ints = new int[2];
                int middleLeft = middle - 1;
                int middleRight = middle + 1;
                while (middleLeft >= 0 && nums[middleLeft] == target) {
                    leftIndex++;
                    middleLeft--;
                }
                int i = 0;
                while (middleRight <= nums.length - 1 && nums[middleRight] == target) {
                    rightIndex++;
                    middleRight++;
                }
                if ((rightIndex + leftIndex + 1) == 1) {
                    ints[0] = middle;
                    ints[1] = middle;
                    break;
                }
                if (leftIndex > 0) {
                    ints[i] = middle - leftIndex;
                    i++;
                }
                if (rightIndex == 0 || leftIndex == 0) {
                    ints[i] = middle;
                    i++;
                }
                if (rightIndex > 0) {
                    ints[i] = middle + rightIndex;
                }

                break;
            }
        }
        if (ints == null) {
            return new int[]{-1, -1};
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,4,5,9};
        int[] ints = searchRange(nums, 3);
        System.out.println("返回结果" + Arrays.toString(ints));
    }
}
