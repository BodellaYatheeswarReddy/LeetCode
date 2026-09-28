class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
                maxi=Math.max(maxi,depth);
            }else if(ch==')'){
                depth--;
            }
        }
        return maxi;
    }
}