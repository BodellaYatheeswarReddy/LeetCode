class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> rev=new HashMap<>();
        String parts[]=s.split(" ");
        if(pattern.length() != parts.length) return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=parts[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(word)){
                    return false;
                }
            }else{
                map.put(c,word);
            }
            if(rev.containsKey(word)){
                if(rev.get(word)!=c){
                    return false;
                }
            }else{
                rev.put(word,c);
            }
        }
        return true;
    }
}