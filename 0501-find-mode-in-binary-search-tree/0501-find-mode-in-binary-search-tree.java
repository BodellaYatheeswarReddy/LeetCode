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
    public void ans(TreeNode root,ArrayList<Integer>ll){
        if(root==null) return ;
        ans(root.left,ll);
        ll.add(root.val);
        ans(root.right,ll);
    }
    public int[] findMode(TreeNode root) {
        ArrayList<Integer>ll=new ArrayList<>();
        ans(root,ll);
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        for(int num:ll){
            int cur=map.getOrDefault(num,0)+1;
            map.put(num,cur);
            maxi=Math.max(maxi,cur);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<ll.size();i++){
            int num=ll.get(i);
            if(map.get(num)==maxi && !ans.contains(num)){
                ans.add(num);
            }
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}