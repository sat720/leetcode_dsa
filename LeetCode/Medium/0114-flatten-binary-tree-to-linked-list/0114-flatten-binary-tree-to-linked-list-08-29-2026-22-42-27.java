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
    
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left == null && root.right != null){
            flatten(root.right);
            return;
        }
        if(root.left != null && root.right == null){
            flatten(root.left);
            root.right = root.left;
            root.left = null;
            return;
        }
        flatten(root.left);
        TreeNode rtemp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode nright = root;
        while(nright.right != null){
            nright = nright.right;
        }
        nright.right = rtemp;
        flatten(nright.right);
    }
}