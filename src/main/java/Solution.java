public class Solution {
    public boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }
    boolean dfs(TreeNode root) {
        if(root.left == null && root.right == null) {
            return root.val == 1;
        }
        if(root.val == 2) {
            return dfs(root.left) || dfs(root.right);
        }
        if(root.val == 3) {
            return dfs(root.left) && dfs(root.right);
        }
        return false;
    }
}
