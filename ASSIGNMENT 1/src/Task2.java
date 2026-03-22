import java.util.Scanner;

public class Task2 {
    public static void readArray(int[] arr, int index, Scanner sc) {
        if (index == arr.length) {
            return;
        }
        arr[index] = sc.nextInt();
        readArray(arr, index + 1, sc);
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        readArray(arr, 0, sc);

        double average = (double) sumArray(arr, 0) / n;
        System.out.println(average);
    }
}