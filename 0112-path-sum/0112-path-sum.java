class Solution 
{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum);
    }

    private boolean helper(TreeNode root, int remainingSum) {
        if (root == null) {
            return false;
        }

        // If it's a leaf node and the remaining sum is 0, we've found a path
        if (root.left == null && root.right == null && remainingSum == root.val) {
            return true;
        }

        // Recursively check the left and right subtrees
        boolean leftPath = helper(root.left, remainingSum - root.val);
        boolean rightPath = helper(root.right, remainingSum - root.val);

        return leftPath || rightPath;
    }
}