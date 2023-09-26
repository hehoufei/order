package Basics;

public class Code01_PrintBinary {
    // 打印某个整数的二进制

    public static void printBinary(int num) {
        // 思路：需要打印每个二进制的数据，要么是0 要么是1
        // & 运算，都为1的时候 才为1，
        for (int i = 31; i >= 0; i--) {
            System.out.print( (num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(6);
        printBinary(10);
        printBinary(13);
        printBinary(-13);
        printBinary(2312312);
    }
}
