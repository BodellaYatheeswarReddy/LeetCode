class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1=ans(arriveAlice);
        int a2=ans(leaveAlice);
        int b1=ans(arriveBob);
        int b2=ans(leaveBob);
        int start=Math.max(a1,b1);
        int end=Math.min(a2,b2);
        return Math.max(0,end-start+1);
    }
    public int ans(String s){
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(s.substring(0,2));
        int day=Integer.parseInt(s.substring(3,5));
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    }
}