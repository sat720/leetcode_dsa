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
    private void traverse(TreeNode node,String path,List<String> lis){
        if(node == null){
            return;
        }
        if(path.isEmpty()){
            path = Integer.toString(node.val);
        }
        else{
            path = path + "->"+node.val;
        }
        if(node.left == null && node.right == null){
            lis.add(path);
            return;
        }
        traverse(node.left,path,lis);
        traverse(node.right,path,lis);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lis = new ArrayList<>();
        traverse(root,"",lis);
        return lis;
    }
}