class Solution {
    public List<Integer> ans(int rows){
        List<Integer> temp=new ArrayList<>();
        long val=1;
        temp.add((int)val);
        for(int i=0;i<rows;i++){
            val=val*(rows-i)/(i+1);
            temp.add((int)val);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ll.add(ans(i));
        }
        return ll;
    }
}