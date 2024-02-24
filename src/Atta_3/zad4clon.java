package Atta_3;

public class zad4clon {
    public static void main(String[] args) {
        solve(4,5);
    }
    public static int[][] solve(int rowCount, int colCount){
        int [][] arr = new int[rowCount][colCount];
        for (int r = 0; r < rowCount; r++){
            for (int c = colCount-1; c >=0; c--){
               arr[r][c] = Math.abs(c-r);
            }
        }
        return arr;
    }
}
