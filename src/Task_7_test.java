import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Task_7_test {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        System.out.print(inarray(n, scanner));
    }

    public static int inarray(int n, Scanner scanner) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        int increasing = findLongestConsecutive(nums, true);
        int decreasing = findLongestConsecutive(nums, false);

        return Math.max(increasing, decreasing);
    }

    public static int findLongestConsecutive(int[] nums, boolean isIncreasing) {
        int length = 1;
        int maxLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if ((isIncreasing && nums[i] > nums[i - 1]) || (!isIncreasing && nums[i] < nums[i - 1])) {
                length++;
            } else {
                length = 1;
            }
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}