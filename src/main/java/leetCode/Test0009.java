package leetCode;


/*
输入：height = [4,2,0,3,2,5]
输出：9

 [0,1,0,2,1,0,1,3,2,1,2,1]
0 1 0 2 – 》 1
2 1 0 1 3 -》 2-1 + 2-0 + 3-1 = 4
2 1 2  – 》 2-1

* */
public class Test0009 {

    public static void main(String[] args) {
        int[] height = {4,2,3};
        int result = getFLow(height);
        System.out.println(result);
    }

    public static int getFLow(int[] height) {
        int result = 0;
        int temp = 0;
        int start = 0;
        int end = start + 1;

        for (int i = 0; i < height.length; i++) {
            while (end < height.length) {
                if (height[start] == 0) {
                    start++;
                    end = start + 1;
                    continue;
                }
                if (height[start] <= height[end]) {
                    start = end;
                    end = start + 1;
                    result += temp;
                    temp = 0;
                } else {
                    temp += height[start] - height[end];
                    end++;
                }
                if (end == height.length) {
                    start ++;
                    end = start + 1;
                    temp = 0;
                }
            }

        }

        return result;
    }


}
