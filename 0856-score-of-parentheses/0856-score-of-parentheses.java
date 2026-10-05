class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(0);
            }else{
                int inside=st.pop();
                int score;
                if(inside==0){
                    score=1;
                }else{
                    score=2*inside;
                }
                st.push(st.pop()+score);
            }
        }
        return st.pop();
    }
}