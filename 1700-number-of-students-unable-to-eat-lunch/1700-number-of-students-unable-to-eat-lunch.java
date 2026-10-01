class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int l=0;l<students.length;l++){
            a.add(students[l]);
        }
        ArrayList<Integer> b=new ArrayList<>();
        for(int l=0;l<sandwiches.length;l++){
            b.add(sandwiches[l]);
        }
        int i=0,count=0;
        while(a.size()!=0){
            if(a.get(i)==b.get(i)){
                a.remove(i);
                b.remove(i);
            }else{
                int h=a.size();
                for(int j=0;j<a.size();j++){
                    if(a.get(j)==b.get(i)){
                        a.remove(j);
                        b.remove(i);
                        break;
                    }
                }
                if(a.size()==h){
                    break;
                }
            }
        }
        for(int k=0;k<a.size();k++){
            count+=1;
        }
        return count;
    }
}