import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class task_7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int n = scanner.nextInt();

        System.out.print(inarray(n));






    }

    public static int inarray(int n) {
        int[] nums = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Ведите число: ");
            nums[i] = scanner.nextInt();
            ;

        }
        System.out.println(Arrays.toString(nums));
        int dlin = 2;
        int max_dlin = 1;
        int flag = fl(1, nums);
        for (int i = 1; i < n-1; i++) {
            if (flag == fl(i+1, nums)) {
                dlin++;
                max_dlin = Math.max(max_dlin, dlin);


            } else {
                flag = fl(i+1, nums);
                dlin = 1;
            }


        }
        return max_dlin;


    }

    public static int fl(int i, int[] array) {
        int flag = 1;
        if (array[i-1] < array[i]){
            flag = -1;
        }
        return flag;

    }
}
