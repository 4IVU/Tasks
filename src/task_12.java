public class task_12 {

    // Размер поля
    private static final int BOARD_SIZE = 8;

    // Возможные ходы коня
    private static final int[] ROW_MOVES = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static final int[] COL_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        // Пример поля
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 2, 2, 2, 2, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        // Координаты начальной позиции коня
        int startRow = 5;
        int startCol = 5;

        // Количество ходов, за которое можно добраться
        int N = 1;

        // Найти все клетки, до которых можно добраться
        findReachableCells(board, startRow, startCol, N);

        // Вывести результат
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findReachableCells(int[][] board, int row, int col, int movesLeft) {
        // Если клетка выходит за границы поля или уже посещена, прервать выполнение
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE || board[row][col] != 0) {
            return;
        }

        // Пометить текущую клетку
        board[row][col] = 1;

        // Если остались ходы, продолжить поиск
        if (movesLeft > 0) {
            for (int i = 0; i < 8; i++) {
                int newRow = row + ROW_MOVES[i];
                int newCol = col + COL_MOVES[i];
                findReachableCells(board, newRow, newCol, movesLeft - 1);
            }
        }
    }
}
