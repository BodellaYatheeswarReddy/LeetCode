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
    public void inorder(ArrayList<Integer> ll,TreeNode root){
        if(root==null) return;
        inorder(ll,root.left);
        ll.add(root.val);
        inorder(ll,root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        inorder(a,root1);
        inorder(b,root2);
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<b.get(j)){
                ans.add(a.get(i++));
            }else{
                ans.add(b.get(j++));
            }
        }
        while(i<a.size()){
            ans.add(a.get(i++));
        }
        while(j<b.size()){
            ans.add(b.get(j++));
        }
        return ans;
    }
}