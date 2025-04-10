import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        extraFun(root, list);
        return list;
    }

    void extraFun(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        extraFun(root.left, list);
        list.add(root.val);
        extraFun(root.right, list);
    }
}