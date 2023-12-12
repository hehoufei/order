package leetCode;

import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_letCode_11 {

    /**
     * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
     * 0 <= a, b, c, d < n
     * a、b、c 和 d 互不相同
     * nums[a] + nums[b] + nums[c] + nums[d] == target
     * 你可以按 任意顺序 返回答案 。
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // 方法2：双指针算法
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        processCompute(nums, result, target);
        return result;
    }

    private static void processCompute(int[] nums, List<List<Integer>> result, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0 && nums[i] > target) {
                return;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sums = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sums > target) {
                        right--;
                    } else if (sums < target) {
                        left++;
                    } else {
                        List<Integer> path = new ArrayList<>();
                        path.add(nums[i]);
                        path.add(nums[j]);
                        path.add(nums[left]);
                        path.add(nums[right]);
                        result.add(path);
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        List<List<Integer>> lists = fourSum(nums, 9);
        System.out.println(lists);
    }
}
