package leetCode;

public class Code_letCode_21 {

    public static void main(String[] args) {
        int[] ints = {3,4,-1,1};
        int i = firstMissingPositive(ints);
        System.out.println(i);
    }

    public static int firstMissingPositive(int[] nums) {
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (res <= nums[i]) {
                res ++;
            }
        }
        return res;
    }
}
