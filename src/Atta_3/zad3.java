package Atta_3;

public class zad3 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,1,1,3},
                {2,1,5,6},

        };
        System.out.println(solve(arr));
    }
    public static int solve(int[][] arr){
        int minsum = 100;
        int n = 0;
        int cursum = 0;
        for (int c = 0; c<arr[0].length; c++){
            for (int r = 0; r < arr.length; r++ ){
                cursum += arr[r][c];
            }
            if (cursum<=minsum){
                minsum=cursum;
                n = c;

            }
            cursum = 0;
        }
        return n;
    }
}
