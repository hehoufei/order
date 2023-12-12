package leetCode;

public class Code_LeetCode_01 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 合并已经排序的两个数组
        int[] arr = new int[nums1.length + nums2.length];
        int n = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n < nums1.length && t < nums2.length) {
                if (nums1[n] <= nums2[t]) {
                    arr[i] = nums1[n];
                    n++;
                    continue;
                } else {
                    arr[i] = nums2[t];
                    t++;
                    continue;
                }
            }
            if (n < nums1.length) {
                arr[i] = nums1[n];
                n++;
                continue;
            }
            if (t < nums2.length) {
                arr[i] = nums2[t];
                t++;
            }
        }
        int length = arr.length;
        if ((length & 1) == 0) {
            // 偶数
            return (double) (arr[length / 2 - 1] + arr[length / 2 ]) /2;
        } else {
            // 奇数
            return (arr[length / 2]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new  int[]{1,2,3};
        int[] nums2 = new  int[]{1,2,3};

        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.print(medianSortedArrays);
    }
}
