package temp;

public class Test01 {

    // 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    // 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2,  3, 4, 5},
                {6, 7,  8, 9, 10},
                {7, 8, 10, 11, 15}
        };
        int length = arr[0].length;
        int length1 = arr[1].length;
        int length2 = arr.length;
        System.out.printf("");
    }

    public boolean function01(int[][] array, int target){

        int length = array.length;
        int length1 = array[1].length;

        /**
         *  int[][] array
         *  1, 2,  3, 4, 5
         *  6. 7,  8, 9, 10
         *  7, 8, 10, 11, 15
         */
        return false;
    }

}
