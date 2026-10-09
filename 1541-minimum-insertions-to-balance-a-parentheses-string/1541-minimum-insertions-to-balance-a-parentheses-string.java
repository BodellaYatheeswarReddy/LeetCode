class Solution {
    public int minInsertions(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }else{
                if(c==')'){
                    if(i+1<s.length() && s.charAt(i+1)==')'){
                        i++;
                    }else{
                        count++;
                    }
                }
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        return count+st.size()*2;
    }
}