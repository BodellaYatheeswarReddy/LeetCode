class Solution {
    public boolean checkString(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                st.push(ch);
            }else{
                if(st.peek()=='b') return false;
            }
        }
        return true;
    }
}