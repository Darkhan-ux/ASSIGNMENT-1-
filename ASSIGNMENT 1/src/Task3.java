import java.util.Scanner;

public class Task3 {
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}