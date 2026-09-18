class Solution {
    public Queue<Integer> q=new PriorityQueue<>();
    //public Queue<Integer> q=new PriorityQueue<>();
    public int min=Integer.MAX_VALUE;
    TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        while(!q.isEmpty()){
            int one=q.poll();
            //int two=0;
            //if(q.peek()!=null) two=q.poll();
            if(q.peek()!=null) min=Math.min(min,Math.abs(one-q.peek()));
        }

        return min;
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            /*if(prev!=null){
                min=Math.min(min,Math.abs(prev.val-root.val));
            }*/
            //prev=root;
            q.offer(root.val);
            inorder(root.right);
        }
    }
}