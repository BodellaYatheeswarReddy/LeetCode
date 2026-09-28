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
    public void get(TreeNode root,ArrayList<Integer> ll){
        if(root==null) return;
        get(root.left,ll);
        ll.add(root.val);
        get(root.right,ll);
    }
    public TreeNode create(ArrayList<Integer>ll,int st,int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(ll.get(mid));
        root.left=create(ll,st,mid-1);
        root.right=create(ll,mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> ll=new ArrayList<>();
        get(root,ll);
        root=create(ll,0,ll.size()-1);
        return root;
    }
}