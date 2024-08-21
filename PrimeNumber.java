
import java.util.Scanner;

public class PrimeNumber {
    public static int nthPrime(int n) {
        int count = 0;
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(); // find the 10th prime number
        int prime = nthPrime(n);
        System.out.println("The " + n + "th prime number is: " + prime);
    }
}