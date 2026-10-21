class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old=image[sr][sc];
        if(old==color) return image;
        ans(image,sr,sc,color,old);
        return image;
    }
    public void ans(int[][] image,int r,int c,int color,int old){
        if(r<0 || c<0 || r>=image.length || c>=image[0].length){
            return;
        }
        if(image[r][c]!=old) return;
        image[r][c]=color;
        ans(image,r-1,c,color,old);
        ans(image,r+1,c,color,old);
        ans(image,r,c-1,color,old);
        ans(image,r,c+1,color,old);
    }
}