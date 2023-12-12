package leetCode;

import jdk.nashorn.internal.ir.IfNode;

public class Code_LetCode_06 {

    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     */
    public static void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1) {
            return;
        }
        int head = 0;
        int tail = s.length - 1;
        while (head <= (tail + tail) / 2) {
            // char temp = s[head];
            // s[head] = s[tail];
            // s[tail] = temp;
            s[head] ^= s[tail];  // 构造 a ^ b 的结果，并放在 a 中
            s[tail] ^= s[head];  // 将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            s[head] ^= s[tail];  // a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
            head++;
            tail--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int i = 29 / 2;
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o' };
        reverseString(chars);

        int a = 1;
        int b = 2;

        a = a ^ b;
        b = b ^ a ;
        a = a ^ b;
        System.out.println(a + b);
    }
}
