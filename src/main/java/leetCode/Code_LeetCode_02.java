package leetCode;

public class Code_LeetCode_02 {


    public static int longestPalindromeSubseq1(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < charArray.length; i++) {

        }
        return 1;
    }
    
    public static int longestPalindromeSubseq(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        char[] charArray1 = resverse(charArray);
        return 1;
    }

    private static char[] resverse(char[] charArray) {
        if (charArray.length == 0) {
            return charArray;
        }
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newCharArray[i] = charArray[charArray.length -1 -i];
        }
        return newCharArray;
    }

    public static void main(String[] args) {
        String s = "A1BC2D33FG2H1I";
        longestPalindromeSubseq(s);
    }

}
