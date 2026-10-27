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
    public void in(ArrayList<Integer>ll,TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ll.add(root.val);
        }
        in(ll,root.left);
        in(ll,root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        in(a,root1);
        in(b,root2);
        if(a.size() != b.size()) return false;
        for(int i=0;i<a.size();i++){
            if(!a.get(i).equals(b.get(i))) return false;
        }
        return true;
    }
}