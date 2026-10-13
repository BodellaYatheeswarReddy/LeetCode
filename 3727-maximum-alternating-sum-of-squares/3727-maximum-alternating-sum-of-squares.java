class Solution {
    public long maxAlternatingSum(int[] nums) {
        if(nums.length==1){
            nums[0]=Math.abs(nums[0]);
            long res=nums[0]*nums[0];
            return res;
        }
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=(long)nums[j]*nums[j];
            sum-=(long)nums[i]*nums[i];
            i++;
            j--;
        }
        if((n%2)!=0){
            sum+=(long)nums[n/2]*nums[n/2];
        }
        return sum;
    }
}