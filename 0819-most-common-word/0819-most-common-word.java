class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<>();
        for(String word : banned){
            set.add(word.toLowerCase());
        }
        paragraph=paragraph.toLowerCase();
        String []words=paragraph.split("[^a-z]+");
        HashMap<String,Integer> map=new HashMap<>();
        String ans="";
        int maxi=0;
        for(String word:words){
            if(set.contains(word)){
                continue;
            }
            int count=map.getOrDefault(word,0)+1;
            map.put(word,count);
            if(count>maxi){
                maxi=count;
                ans=word;
            }
        }
        return ans;
    }
}