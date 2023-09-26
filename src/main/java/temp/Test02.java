package temp;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Objects;

public class Test02 {

    // 题目：请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”。
    //

    public static void main(String[] args) {
        String s = function01("We are happy.");
        System.out.printf(s);
    }

    public static String function01(String target) {
        if (null != target) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                if (c == ' ') {
                    stringBuilder.append("%20");
                } else {
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }
        return "";
    }

}
