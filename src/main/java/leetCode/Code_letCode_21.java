package leetCode;

public class Code_letCode_21 {

    public static void main(String[] args) {
        int[] ints = {1, 0};
        int i = firstMissingPositive(ints);
        System.out.println(i);
    }

    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        if (nums.length == 1) {
            return nums[0] == 1 ? 2 : 1;
        }
        int min1;
        int min2;
        if (nums.length == 2) {
            min1 = nums[0];
            min2 = nums[1];
            if (min1 == 1) {

            }
        } else {
            int res = 1;
            min1 = Math.max(nums[0], 0);
            min2 = Math.max(nums[nums.length - 1], 0);
            int left = 0;
            int right = nums.length - 1;
            while (left <= right && left <= nums.length - 1 && right > 0) {
                if (nums[left] <= nums[right]) {
                    right--;
                    if (nums[right] > 0) {
                        if (min2 > 0) {
                            min2 = Math.min(nums[right], min2);
                        } else {
                            min2 = Math.max(nums[right], min2);
                        }
                    }
                } else {
                    left++;
                    if (nums[left] > 0) {
                        if (min1 > 0) {
                            min1 = Math.min(nums[left], min1);
                        } else {
                            min1 = Math.max(nums[left], min1);
                        }
                    }
                }
            }
        }

        int min = Math.min(min1, min2);
        int max = Math.max(min1, min2);
        if (min == 1 && min + 1 == max) {
            return max + 1;
        }
        if (min == 1 && min + 1 < max) {
            return min + 1;
        }
        if (max - min > 1) {
            return 1;
        }
        return res;
    }
}
