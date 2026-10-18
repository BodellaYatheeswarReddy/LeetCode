class Solution {
    public int[] constructRectangle(int area) {
        int arr[]=new int[2];
        if(area==1){
            arr[0]=1;
            arr[1]=1;
            return arr;
        }
        for(int i=2;i<=area;i++){
            if(area%i==0){
                int l=i;
                int b=area/i;
                if(l>=b){
                    arr[0]=l;
                    arr[1]=b;
                    break;
                }
            }
        }
        return arr;
    }
}