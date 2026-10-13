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
    public void inorder(TreeNode root,ArrayList<Integer>ll){
        if(root==null) return;
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer>ll=new ArrayList<>();
        inorder(root,ll);
        int i=0;
        TreeNode prev=null;
        TreeNode temp=null;
        while(i<ll.size()){
            if(prev==null){
                temp=new TreeNode(ll.get(i));
                i++;
                prev=temp;
                continue;
            }
            prev.left=null;
            prev.right=new TreeNode(ll.get(i));
            prev=prev.right;
            i++;
        }
        return temp;
    }
}