package leetCode;

public class Code_LetCode_19 {

    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
     * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * 输入：target = 7, nums = [2,3,1,2,4,3] 输出：2 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     */
    public static int minSubArrayLen(int target, int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1 && nums[0] != target) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int minLength = 0;
        for (int slowIndex = 0; slowIndex < nums.length; slowIndex++) {
            if (nums[slowIndex] == target) {
                return 1;
            }
            int fastIndex = slowIndex + 1;
            while (fastIndex < nums.length) {
                int sum = 0;
                for (int i = slowIndex; i <= fastIndex; i++) {
                    sum += nums[i];
                }
                if (sum == target) {
                    if (minLength == 0) {
                        minLength = fastIndex - slowIndex + 1;
                    } else {
                        minLength = Math.min(minLength, fastIndex - slowIndex + 1);
                    }
                }
                if (sum > target) {
                    break;
                }
                fastIndex ++;
            }
        }
        return minLength;
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static int minSubArrayLen3(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int i = minSubArrayLen2(11, nums);
        System.out.println(i);
    }
}
