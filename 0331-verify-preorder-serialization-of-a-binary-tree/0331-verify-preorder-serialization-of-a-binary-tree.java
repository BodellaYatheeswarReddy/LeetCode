class Solution {
    public boolean isValidSerialization(String preorder) {
        String arr[]=preorder.split(",");
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(count==0) return false;
            count--;
            if(!arr[i].equals("#")){
                count+=2;
            }
        }
        return count==0;
    }
}