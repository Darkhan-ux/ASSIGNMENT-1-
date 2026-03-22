import java.util.Scanner;

public class Task7 {
    public static void readAndPrintReverse(int n, Scanner sc) {
        if (n == 0) {
            return;
        }

        int x = sc.nextInt();
        readAndPrintReverse(n - 1, sc);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        readAndPrintReverse(n, sc);
    }
}