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

class Solution{
    public int kthSmallest(TreeNode root,int k){
        ArrayList<Integer> ll=new ArrayList<>();
        ans(ll,root);
        if(k<=0 || k>ll.size()) return -1;
        return ll.get(k-1);
    }
    public void ans(ArrayList<Integer>ll,TreeNode root){
        if(root==null) return;
        ans(ll,root.left);
        ll.add(root.val);
        ans(ll,root.right);
    }
}

/*class Solution {
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        if(root.left!=null){
            int left=kthSmallest(root.left,k);
            if(left!=-1) return left;
        }
        if(count+1==k){
            return root.val;
        }
        count+=1;
        if(root.right!=null){
            int right=kthSmallest(root.right,k);
            if(right!=-1) return right;
        }
        return -1;
    }
}*/