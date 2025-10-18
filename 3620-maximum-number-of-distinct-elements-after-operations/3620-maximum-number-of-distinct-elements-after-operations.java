class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        long occupied = Long.MIN_VALUE;

        for (int num : nums) {
            long low = (long)num - k;
            long high = (long)num + k;

            if (occupied < high) {
                occupied = Math.max(occupied + 1, low);
                ans++;
            }
        }
        return ans;
    }
}
