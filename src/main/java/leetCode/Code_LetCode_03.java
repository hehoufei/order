package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_LetCode_03 {

    /**
     * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
     *
     * 只使用数字1到9
     * 每个数字 最多使用一次
     * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
     */
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        Integer sum = 0;
        Integer start = 1;
        processCompute(result, path, k , n, sum, start);
        return result;
    }

    private static void processCompute(List<List<Integer>> result, LinkedList<Integer> path, int k, int n, Integer sum, Integer start) {
        if (sum > n) {
            return;
        }
        if (path.size() > k) {
            return;
        }
        if (path.size() == k && n == sum) {
            result.add(new ArrayList<>(path));
            return ;
        }
        for (int i = start; i <= 9 && i <= n; i++) {
            path.add(i);
            sum += i;
            processCompute(result, path, k, n, sum, i+1);
            path.removeLast();
            sum -= i;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = combinationSum3(2, 6);
        System.out.println(lists.toString());
    }
}
