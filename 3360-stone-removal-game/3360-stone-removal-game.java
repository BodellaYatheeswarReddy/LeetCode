class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        int turn=0;
        while(n>=i){
            n-=i;
            i--;
            turn++;
        }
        return turn%2==1;
    }
}