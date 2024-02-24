import java.util.Arrays;

public class arr90{
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedArray = rotateArray(originalArray);

        for (int[] row : rotatedArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] rotateArray(int[][] array) {
        int rows = array.length;

        int columns = array[0].length;

        int[][] rotatedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedArray[j][rows - 1 - i] = array[i][j];
            }
        }

        return rotatedArray;
    }
}