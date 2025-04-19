import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();

        if (n == 0) {
            return res;
        }

        for (int i = 0; i < n; ) {
            int start = nums[i];
            int end = nums[i];

            // Find the end of the current consecutive range
            while (i + 1 < n && nums[i + 1] == end + 1) {
                end++;
                i++;
            }

            // Add the range to the result list
            if (start == end) {
                res.add(String.valueOf(start));
            } else {
                res.add(start + "->" + end);
            }
            i++; // Move to the next potential start of a range
        }

        return res;
    }
}