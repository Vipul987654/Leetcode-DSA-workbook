import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        // Sort the candidates array to handle duplicates effectively
        Arrays.sort(candidates);
        trackMe(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    public void trackMe(List<List<Integer>> list, List<Integer> tempList, int[] nums, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < nums.length; i++) {
                // Skip duplicate numbers at the same level of recursion
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                tempList.add(nums[i]);
                trackMe(list, tempList, nums, target - nums[i], i); // Still allow using the same number
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}