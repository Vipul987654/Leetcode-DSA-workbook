import java.util.ArrayList;
import java.util.List;



class Solution
 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        extraFun(root, list);

     

        // Debug 2: Check the size of the list to avoid index out of bounds
        if (list.size() <= 1) {
            return true; // An empty or single-node tree is a valid BST
        }

        for (int i = 0; i < list.size() - 1; i++) {
           
           
            if (list.get(i + 1) <= list.get(i)) {
                return false;
            }
        }
        return true;
    }

    void extraFun(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        extraFun(root.left, list);
        list.add(root.val);
        extraFun(root.right, list);
    }}