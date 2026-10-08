class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int atTheLevel = queue.size();
            double sum = 0;
            for (int i = 0; i < atTheLevel; i++) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            res.add(sum / atTheLevel);
        }
        return res;
    }
}