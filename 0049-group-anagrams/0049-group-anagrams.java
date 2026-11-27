class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String naya=new String(arr);
            if(!map.containsKey(naya)){
                map.put(naya,new LinkedList<>());
            }
            map.get(naya).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}