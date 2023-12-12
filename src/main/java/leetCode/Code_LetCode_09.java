package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_LetCode_09 {

    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * 你返回所有和为 0 且不重复的三元组。
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        // 方法2：双指针算法
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        processCompute(nums, result);
        return result;
    }

    private static void processCompute(int[] nums, List<List<Integer>> result) {
        if (nums.length < 2) {
            return;
        }
        int leftIndex;
        int rightIndex;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            leftIndex = i + 1;
            rightIndex = nums.length - 1;
            if (leftIndex >= nums.length) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (rightIndex > leftIndex) {
                int sum = nums[i] + nums[leftIndex] + nums[rightIndex];
                if (sum > 0) {
                    rightIndex--;
                } else if (sum < 0) {
                    leftIndex++;
                } else {
                    LinkedList<Integer> path = new LinkedList<>();
                    path.add(nums[i]);
                    path.add(nums[leftIndex]);
                    path.add(nums[rightIndex]);
                    result.add(new ArrayList<>(path));
                    while (rightIndex > leftIndex && nums[rightIndex] == nums[rightIndex - 1]) {
                        rightIndex--;
                    }
                    while (rightIndex > leftIndex && nums[leftIndex] == nums[leftIndex + 1]) {
                        leftIndex++;
                    }
                    leftIndex++;
                    rightIndex--;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }
}
