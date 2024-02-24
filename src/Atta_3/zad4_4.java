package Atta_3;

public class zad4_4 {
    public static void main(String[] args) {
        int[][] arr = solve(4,5);
    }
    public static int[][] solve(int rowCount, int colCount){
        int [][] arr2 = new int[rowCount][colCount];
        int n = 1;
        int nul = 0;

        for (int r = 0; r< arr2.length; r++){
            for (int c = 0; c< arr2[0].length; c++) {
                if (r % 2 == 0) {
                    if (c % 2 == 0) {
                        arr2[r][c] = nul;
                    } else {
                        arr2[r][c] = n;
                        n++;
                    }
                } else {
                    if (c % 2 == 0) {
                        arr2[r][c] = n;
                        n++;
                    } else {
                        arr2[r][c] = nul;

                    }
                }
            }
        }
        return arr2;
    }
}
