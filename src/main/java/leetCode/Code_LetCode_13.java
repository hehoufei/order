package leetCode;

public class Code_LetCode_13 {

    // 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int length = nums.length;
        if (length == 0) {
            if (nums[0] >= target) {
                return 0;
            } else {
                return 1;
            }
        }
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            if (left == right) {
                if (nums[left] >= target) {
                    return left ;
                } else {
                    return left + 1;
                }
            }
            int middle = left + ((right - left) >> 1);
            if (nums[middle] > target) {
                    right = middle - 1;
            } else if (nums[middle] < target) {
                    left = middle + 1;
            } else {
                return middle;
            }
            if (left == middle) {
                if (nums[left] >= target) {
                    return left ;
                } else {
                    return left + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrs = new int[]{1,3};
        int i = searchInsert(arrs, 0);
        System.out.printf("返回：" + i);
    }
}
