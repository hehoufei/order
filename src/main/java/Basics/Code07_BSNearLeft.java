package Basics;

import java.lang.annotation.Target;
import java.util.LinkedList;
import java.util.List;

public class Code07_BSNearLeft {

    // 有序数组中找到>=num最左的位置

    public static int findNum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        if (left > right) {
            return -1;
        }
        while (left <= right) {
            int half = (left + right) / 2;
            if (arr[half] == target) {
                return half;
            } else if (arr[half] > target) {
                right = half + 1;
            } else {
                left = half - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        List<List<Integer>> permute = permute(arr);
        System.out.println(permute.toString());
    }



    static List<List<Integer>> res = new LinkedList<>();

    /* 主函数，输入一组不重复的数字，返回它们的全排列 */
    static List<List<Integer>> permute(int[] nums) {
        // 记录「路径」
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }

    // 路径：记录在 track 中
// 选择列表：nums 中不存在于 track 的那些元素
// 结束条件：nums 中的元素全都在 track 中出现
    static void backtrack(int[] nums, LinkedList<Integer> track) {
        // 触发结束条件
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 排除不合法的选择
            if (track.contains(nums[i]))
                continue;
            // 做选择
            track.add(nums[i]);
            // 进入下一层决策树
            backtrack(nums, track);
            // 取消选择
            track.removeLast();
        }
    }
}
