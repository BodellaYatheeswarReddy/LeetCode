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
    public void pre(Node root,ArrayList<Integer> ll){
        if(root==null) return;
        ll.add(root.val);
        for(Node child : root.children){
            pre(child,ll);
        }
    }
    public List<Integer> preorder(Node root) {
        ArrayList<Integer>ll=new ArrayList<>();
        pre(root,ll);
        return ll;
    }
}