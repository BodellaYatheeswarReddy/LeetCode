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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur==null){
                int maxi=Integer.MIN_VALUE;
                for(int i=0;i<ll.size();i++){
                    maxi=Math.max(maxi,ll.get(i));
                }
                ans.add(maxi);
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
        return ans;
    }
}