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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> ll=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur==null){
                ans.add(ll);
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    ll=new ArrayList<>();
                }
            }else{
                ll.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}