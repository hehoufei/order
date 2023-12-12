package leetCode;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Code_LetCode_04 {

    /**
     * 给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
     * <p>
     * candidates 中的每个数字在每个组合中只能使用 一次 。
     * <p>
     * 注意：解集不能包含重复的组合。
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        if (candidates.length == 0) {
            return null;
        }
        Integer sum = 0;
        Integer start = 0;
        Map<String, String> map = new HashMap<>();
        Arrays.sort(candidates);
        processCompute(result, path, candidates, target, sum, start, map);
        return result;
    }

    // [1,2,3,4] target = 5
    public static void processCompute(List<List<Integer>> result, LinkedList<Integer> path, int[] candidates, int target, Integer sum, Integer start, Map<String, String> map) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            // StringBuilder key = new StringBuilder();
            // for (int i = 0; i < path.size(); i++) {
            //     key.append(path.get(i).toString());
            // }
            // String value = map.get(key.toString());
            // if (value == null || value.isEmpty()) {
            //     map.put(key.toString(), path.toString());
            //     result.add(new ArrayList<>(path));
            // }
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            sum += candidates[i];
            processCompute(result, path, candidates, target, sum, i + 1, map);
            path.removeLast();
            sum -= candidates[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,4,2,1,4,2,2,1,3};
        int target = 6;
        List<List<Integer>> lists = combinationSum2(arr, target);
        System.out.println(lists.toString());
    }
}
