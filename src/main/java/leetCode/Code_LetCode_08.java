package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_LetCode_08 {

    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * 你返回所有和为 0 且不重复的三元组。
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        // 方法1：回溯算法
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum = 0;
        int start = 0;
        Arrays.sort(nums);
        processCompute(result, path, nums, sum, start);
        // 方法2：双指针算法
        return result;
    }

    private static void processCompute(List<List<Integer>> result, LinkedList<Integer> path, int[] nums, int sum, int start) {
        if (path.size() == 3 && sum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            sum += nums[i];
            processCompute(result, path, nums, sum, i+1);
            path.removeLast();
            sum -= nums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,-1,0,3,1,-2};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }
}
