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
    static int ans;
    static class info{
        int min;
        int max;
        int sum;
        info(int min,int max,int sum){
            this.min=min;   
            this.max=max;
            this.sum=sum;
        }
    }
    public int maxSumBST(TreeNode root) {
        ans=0;
        helper(root);
        return ans;
    }
    public info helper(TreeNode root){
        if(root==null){
            return new info(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        info left=helper(root.left);
        info right=helper(root.right);
        if(root.val>left.max && root.val<right.min){
            int curmin=Math.min(root.val,left.min);
            int curmax=Math.max(root.val,right.max);
            int cursum=left.sum+right.sum+root.val;
            ans=Math.max(ans,cursum);
            return new info(curmin,curmax,cursum);
        }
        return new info(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
    }
}