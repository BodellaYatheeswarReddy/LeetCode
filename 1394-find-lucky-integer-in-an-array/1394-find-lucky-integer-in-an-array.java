class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int maxi=-1;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>maxi && arr[i]==map.get(arr[i])){
                ans=arr[i];
                maxi=map.get(arr[i]);
            }
        }
        return ans;
    }
}
