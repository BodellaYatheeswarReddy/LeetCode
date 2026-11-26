class Solution {
    static class Node{
        Node[] children=new Node[26];
        boolean eow;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    static Node root=new Node();
    public static String ans="";
    public static void insert(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(cur.children[idx]==null){
                cur.children[idx]=new Node();
            }
            cur=cur.children[idx];
        }
        cur.eow=true;
    }
    public static void find(Node root,StringBuilder temp){
        if(root==null) return;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char c=(char)(i+'a');
                temp.append(c);
                if(temp.length()>ans.length()){
                    ans=temp.toString(); 
                }
                find(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static String longestWord(String[] words) {
        root=new Node();
        ans="";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        find(root,new StringBuilder());
        return ans;
    }
}