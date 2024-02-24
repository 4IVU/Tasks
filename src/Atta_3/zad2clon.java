package Atta_3;

public class zad2clon {
    public static void main(String[] args) {
        int[] arr = {2,4,8,3,6,8,7};
        int[] arr2 = new int[10];
        arr2 = solve(arr);


    }
    public static int[] solve(int[] arr){
        int min = getMin(arr);

        if ((Math.abs(arr[0]) % 2 == 0) && (Math.abs(arr[1]) % 2 !=0)){
            arr[0] = min;
        }

        for (int i= 1; i<arr.length; i++){
            if (Math.abs(arr[i]) % 2 == 0 && (Math.abs(arr[i-1]) % 2 !=0 || Math.abs(arr[i+1]) % 2 !=0)){
                arr[i] = min;
            }

            if (i == arr.length-2){
                if ((arr[i] % 2 == 0) && (arr[i+1] % 2 !=0)){
                    arr[i] = min;
                }
            }
        }
        return arr;
    }

    private static int getMin(int[] arr) {
        int min = 100;
        if ((Math.abs(arr[0]) % 2 == 0) && (Math.abs(arr[1]) % 2 !=0)){
            if (arr[0] < min){
                min = arr[0];
            }
        }

        for (int i = 1; i< arr.length; i++){

            if (i == arr.length-2){
                if ((Math.abs(arr[i]) % 2 == 0) && (Math.abs(arr[i+1]) % 2 !=0)){
                    if (arr[i] < min){
                        min = arr[i];

                    }
                }
            }
            if (Math.abs(arr[i]) % 2 == 0 && (Math.abs(arr[i-1]) % 2 !=0 || Math.abs(arr[i+1]) % 2 !=0)){
                if (arr[i] < min){
                    min = arr[i];
                }
            }

        }
        return min;
    }
}
