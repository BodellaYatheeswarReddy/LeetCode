class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int num:students){
            q.add(num);
        }
        int count=0;
        int i=0;
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[i]){
                q.remove();
                i++;
                count=0;
            }else{
                q.add(q.remove());
                count++;
                if(q.size()==count){
                    break;
                }
            }
        }
        return q.size();
    }
}