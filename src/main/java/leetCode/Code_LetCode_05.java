package leetCode;

public class Code_LetCode_05 {

    public static int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (val != nums[fastIndex]) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,2,2};
        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);
    }
}
