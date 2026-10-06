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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        ArrayList<Integer> ll=new ArrayList<>();
        inorder(root,ll);
        int i=0;
        int j=ll.size()-1;
        while(i<j){
            int sum=ll.get(i)+ll.get(j);
            if(sum==k) return true;
            if(sum<k){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public void inorder(TreeNode root,ArrayList<Integer>ll){
        if(root==null) return;
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
}