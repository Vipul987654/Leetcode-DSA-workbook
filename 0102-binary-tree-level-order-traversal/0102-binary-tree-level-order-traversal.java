

class Solution
 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listum = new ArrayList<>();
        if (root == null) {
            return listum; // Return an empty list, not null
        }

        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);

        while (!Q.isEmpty()) {
            int levelSize = Q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = Q.poll();
                currentLevel.add(curr.val);

                if (curr.left != null) {
                    Q.offer(curr.left);
                }
                if (curr.right != null) {
                    Q.offer(curr.right);
                }
            }
            listum.add(currentLevel);
        }
        return listum;
    }
}