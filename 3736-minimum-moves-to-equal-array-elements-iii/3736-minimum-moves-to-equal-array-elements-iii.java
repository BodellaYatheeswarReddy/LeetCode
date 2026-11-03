class Solution {
    public int minMoves(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi) maxi=nums[i];
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=maxi-nums[i];
        }
        return ans;
    }
}