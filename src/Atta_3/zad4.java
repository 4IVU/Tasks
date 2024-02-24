package Atta_3;

public class zad4 {
    public static void main(String[] args) {
        int[][] arr = solve(4,5);

    }
    public  static int[][] solve(int rowCount, int colCount){
        int [][] arr2 = new int[rowCount][ colCount];
        int col = 1;

        for (int r = 0; r< arr2.length; r++){
            int row = r;
            for(int c = 0; c<arr2[0].length; c++){
                if (row>=0){
                    arr2[r][c] = row;
                    row--;
                }else {
                    arr2[r][c] = col;
                    col++;
                }
            }
            col = 1;
        }
        return arr2;
    }
}
