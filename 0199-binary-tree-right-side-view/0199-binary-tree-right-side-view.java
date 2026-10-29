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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ll=new ArrayList<>();
        if(root==null) return ll;
        q.add(root);
        q.add(null);
        TreeNode prev=null;
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur==null){
                ll.add(prev.val);
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                prev=cur;
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        return ll;
    }
}