class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ll=new ArrayList<>();
        long val=1;
        ll.add((int)val);
        for(int i=0;i<rowIndex;i++){
            val=val*(rowIndex-i)/(i+1);
            ll.add((int)val);
        }
        return ll;
    }
}