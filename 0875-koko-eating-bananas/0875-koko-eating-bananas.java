class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=ans(piles,mid);
            if(total<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int ans(int [] piles,int hours){
        int res=0;
        for(int i=0;i<piles.length;i++){
            res+=Math.ceil((double)piles[i]/hours);
        }
        return res;
    }
}