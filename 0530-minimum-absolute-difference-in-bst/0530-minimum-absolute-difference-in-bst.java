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
    TreeNode prev;
    int ans;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
            ans=Math.min(ans,root.val-prev.val);
        }
        prev=root;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        prev=null;
        ans=Integer.MAX_VALUE;
        inorder(root);
        return ans;
    }
}