class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) {
            return true;
        }

        if(root.left != null && root.data != root.left.data) {
            return false;
        }

        if(root.right != null && root.data != root.right.data) {
            return false;
        }

        return isUnivalTree(root.left ) && isUnivalTree(root.right);
    }
}