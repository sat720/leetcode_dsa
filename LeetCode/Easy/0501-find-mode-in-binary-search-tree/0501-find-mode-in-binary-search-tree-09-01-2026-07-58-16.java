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

    private Integer prev = null;
    private int count = 0;
    private int maxcount = 0;
    private List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] res = new int[modes.size()];
        for(int i = 0 ; i < modes.size();i++){
            res[i] = modes.get(i);
        }
        return res;
    }
    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(prev != null && root.val == prev){
            count++;
        }
        else{
            count = 1;
        }
        if(count > maxcount){
            maxcount = count;
            modes.clear();
            modes.add(root.val);
        }
        else if(count == maxcount){
            modes.add(root.val);
        }
        prev = root.val;
        dfs(root.right);
    }
}