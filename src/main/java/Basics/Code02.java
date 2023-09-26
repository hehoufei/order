package Basics;

import jdk.nashorn.internal.objects.annotations.Function;
import sun.print.SunMinMaxPage;

import java.util.FormatFlagsConversionMismatchException;

public class Code02 {

    /**
     * 给定一个参数N，
     * 返回：  1! + 2! + 3! + 4! + … + N!   的结果
     */

    public static void print(int num){
        long result = 0;
        for (int i = 0; i < num; i++) {
            long f = f(i);
            result +=  f;
        }
        System.out.println(result);
    }
    public static long f(int num){
        long sum = 1;
        for (int i = num; i > 0; i--) {
            sum *= num;
        }
        return sum;
    }
}
