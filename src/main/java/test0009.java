public class test0009 {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.printf("" + trap(height));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 2) {
            System.out.printf("hhh ");

            System.out.printf("第二次 ");

            System.out.printf("第三次 ");
            System.out.printf("第四次 ");
            return 0;
        }
        int result = 0;
        int left = 1;
        int right = height.length - 2;
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        while (left <= right) {
            if (leftMax <= rightMax) {
                result += Math.max(leftMax - height[left], 0);
                leftMax = Math.max(leftMax, height[left]);
                left ++;
            } else {
                result += Math.max(rightMax - height[right], 0);
                rightMax = Math.max(rightMax, height[right]);
                right --;
            }

        }
        return result;
    }
}
