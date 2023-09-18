class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int m = image.length, n = image[0].length;

        int newColor = color;
        color = image[sr][sc];

        if(color == newColor) {
            return image;
        }

        floodFillRecur(image, sr, sc, color, newColor, m , n);
      return image;  
    }
    public void floodFillRecur(int[][] image, int m, int n, int color, int newColor, int x , int y) {
        if(m >= 0 && m < x && n >= 0 && n < y && image[m][n] == color) {
        image[m][n] = newColor;
        floodFillRecur(image, m + 1, n, color, newColor, x , y);
        floodFillRecur(image, m - 1, n, color, newColor, x , y);
        floodFillRecur(image, m , n + 1, color, newColor, x , y);
        floodFillRecur(image, m, n -1, color, newColor, x , y); 
        }

    }
  /*   public boolean isValid(int m, int n, int x, int y) {
        if(m >= 0 && m < x && n >= 0 && n < y) {
            return true;
        }
        return false;
    } */

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        FloodFill f = new FloodFill();
        int[][] out =  f.floodFill(image, 1, 1, 2);

       for (int i = 0; i < out.length; i++) {
        for (int j = 0; j < out[0].length; j++) {
            System.out.print(out[i][j] + " ");
        }
        System.out.println();
        
       }
    }
}