class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            // Check the least significant bit (LSB)
            if ((n & 1) == 1) {
                count++;
            }
            // Right shift n by 1 (unsigned shift to handle negative numbers correctly)
            n >>>= 1;
        }
        return count;
    }
}
