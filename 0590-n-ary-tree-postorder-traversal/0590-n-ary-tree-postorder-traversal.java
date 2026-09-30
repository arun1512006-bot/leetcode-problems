class Solution {
    List<Integer> res = new ArrayList<>();

    private void postOrder(Node root) {
        if (root == null)
            return;
        for (Node child : root.children) {
            postOrder(child);
            res.add(child.val);
        }
    }

    public List<Integer> postorder(Node root) {
        if (root == null)
            return new ArrayList<>();
        postOrder(root);
        res.add(root.val);
        return res;
    }
}