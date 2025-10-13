class Solution {
    public String triangleType(int[] nums) {
        // Check if it can form a valid triangle
        if (nums[0] + nums[1] > nums[2] &&
            nums[0] + nums[2] > nums[1] &&
            nums[1] + nums[2] > nums[0]) {

            // Check for equilateral
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            }
            // Check for isosceles
            else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return "isosceles";
            }
            // Otherwise scalene
            else {
                return "scalene";
            }
        } else {
            return "none";
        }
    }
}
