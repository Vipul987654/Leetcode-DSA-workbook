class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Corrected loop initialization and condition
        for (int i = 0, j = 2; i < n - 2 && j < n; i++, j++) {
            // Check for the condition
            if (2*(nums[i] + nums[j]) == nums[j - 1]) {
                count++;
            }
        }
        return count;
    }
}