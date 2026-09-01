/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int mindiff = Integer.MAX_VALUE;
    private TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return mindiff;
    }
    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(prev != null){
            mindiff = Math.min(mindiff,root.val - prev.val);
        }
        prev = root;
        dfs(root.right);
    }
}