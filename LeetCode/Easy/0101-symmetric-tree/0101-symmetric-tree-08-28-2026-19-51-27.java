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
    private boolean ismirror(TreeNode l,TreeNode r){
        if(l == null && r  == null){
            return true;
        }
        if(l == null || r == null){
            return false;
        }
        return ((l.val == r.val) && ismirror(l.left,r.right)&&ismirror(l.right,r.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return ismirror(root.left,root.right);    
    }
}