

class Solution {
    public List<Double> averageOfLevels(TreeNode root)
     {
        List<Double> averages = new ArrayList<>();
        if (root == null) {
            return averages;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0.0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            averages.add(sum / levelSize);
        }

        return averages;
    }
}