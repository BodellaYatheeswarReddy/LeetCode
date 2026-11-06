class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        while(!map.isEmpty()){
            char max_char=' ';
            int max_freq=0;
            for(char c:map.keySet()){
                if(map.get(c)>max_freq){
                    max_char=c;
                    max_freq=map.get(c);
                }
            }
            for(int i=0;i<max_freq;i++){
                sb.append(max_char);
            }
            map.remove(max_char);
        }
        return sb.toString();
    }
}