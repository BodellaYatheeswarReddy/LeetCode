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
    public void inorder(ArrayList ll,TreeNode root){
        if(root==null) return;
        inorder(ll,root.left);
        ll.add(root.val);
        inorder(ll,root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer>ll=new ArrayList<>();
        inorder(ll,root);
        TreeSet<Integer> set=new TreeSet<>(ll);
        if(set.size()<2) return -1;
        Iterator<Integer> it =set.iterator();
        it.next();
        return it.next();
    }
}