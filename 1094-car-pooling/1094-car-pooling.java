class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int arr[]=new int[1001];
        for(int i=0;i<trips.length;i++){
            int passengers=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];

            arr[from]+=passengers;
            arr[to]-=passengers;
        }
        int count=0;
        for(int i=0;i<1001;i++){
            count+=arr[i];
            if(count>capacity) return false;
        }
        return true;
    }
}