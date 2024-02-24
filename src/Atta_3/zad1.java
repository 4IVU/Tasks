package Atta_3;

public class zad1 {
    public static void main(String[] args) {
        int[] arr = {5,8,4,8};
        System.out.println(solve(arr));
    }
    public static int solve(int[] myarray){
        int ar = 0;
       int atfirs = myarray[0];
        int n = myarray[0];
       for (int element : myarray){
           if (element == atfirs){
               ar = 1;
           }else {
               ar = 0;
               break;
           }
       }
        if (ar==1){
            return Integer.MIN_VALUE;
        }else{
            int max = 0;
            for (int val : myarray){
                if (val > max){
                    max = val;
                }
                for (int i = 1; i<myarray.length; i++){
                    if (myarray[i] >= myarray [i-1] && myarray [i] < max){
                        n = myarray[i];
                    }
                }
            }
        }
       return n;

    }
}
