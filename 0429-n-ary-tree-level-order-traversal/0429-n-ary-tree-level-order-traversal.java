/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> ll=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur=q.remove();
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
                for(Node child : cur.children){
                    q.add(child);
                }
            }
        }
        return ans;
    }
}