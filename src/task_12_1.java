public class task_12_1 {
    private static final int[] row = {-2, - 2, -1, -1, 2, 2, 1, 1};
    private static final int[] col = {1, -1, -2, 2,-1, 1, 2, -2};
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 2, 0, 0, 0},
                {0, 2, 0, 0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 2, 0, 0},
                {0, 0, 2, 0, 2, 0, 0, 0},
                {0, 0, 0, 2, 2, 2, 2, 2},
                {0, 0, 0, 0, 0, 0, 0, 0}

        };
        Knight(board, 2, 3, 2
        );
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void Knight(int[][] board, int x, int y, int n){
        board[x][y] = 1;
        
        for(int i = 0; i<8 ; i++){
            int x_now = x + row[i];
            int y_now = y + col[i];
            if (n > 0) {
                if ((x_now < 8) &&(x_now >= 0) &&(y_now < 8) && (y_now >= 0)) {
                    if (board[x_now][y_now] == 0) {
                        Knight(board,x_now,y_now,n-1);

                    }
                }
            }
                


        }


    }
    

}

