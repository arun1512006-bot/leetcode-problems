class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
             return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val == val){
                return node;
            }
            if(node.val > val && node.left != null){
                stack.push(node.left);
            }
            if(node.val < val && node.right != null){
                stack.push(node.right);
            }
        }
        return null;
    }
}