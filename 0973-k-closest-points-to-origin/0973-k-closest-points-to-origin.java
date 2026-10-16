class Solution {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int sqr;
        public Point(int x,int y,int sqr){
            this.x=x;
            this.y=y;
            this.sqr=sqr;
        }
        @Override
        public int compareTo(Point p2){
            return Integer.compare(this.sqr,p2.sqr);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int sqr=x*x+y*y;
            pq.add(new Point(x,y,sqr));
        }
        int [][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            Point p=pq.poll();
            ans[i][0]=p.x;
            ans[i][1]=p.y; 
        }
        return ans;
    }
}