class Solution {
    public int gcd(int a, int b) {
        int gcdVal = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcdVal = i;
            }
        }
        return gcdVal;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;

        // Step 1: Count existing ones
        for (int num : nums) {
            if (num == 1) ones++;
        }

        if (ones > 0) {
            return n - ones; // each non-1 becomes 1
        }

        // Step 2: Find shortest subarray with gcd == 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currGcd = nums[i];
            for (int j = i + 1; j < n; j++) {
                currGcd = gcd(currGcd, nums[j]);
                if (currGcd == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) return -1; // no gcd=1 possible

        // Step 3: Total operations = (minLen - 1) to create first 1 + (n - 1) to spread it
        return (minLen - 1) + (n - 1);
    }
}
