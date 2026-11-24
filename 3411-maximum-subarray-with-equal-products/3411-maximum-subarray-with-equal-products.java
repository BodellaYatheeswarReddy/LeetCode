class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long prod=1;
            int g=0;
            long l=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                g=gcd(g,nums[j]);
                l=(l/gcd((int)l,nums[j]))*nums[j];
                if(prod==(int)l*g){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}