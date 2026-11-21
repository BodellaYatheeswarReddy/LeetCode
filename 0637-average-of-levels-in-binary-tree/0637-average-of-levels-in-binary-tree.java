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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Double> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur==null){
                double sum=0;
                int count=0;
                for(int i=0;i<ll.size();i++){
                    sum+=ll.get(i);
                    count++;
                }
                double avg= sum/count;
                ans.add(avg);
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    ll=new ArrayList<>();
                }
            }else{
                ll.add((double)cur.val);
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