import java.util.Scanner;

public class Main {
    // Recursive method to check if a number is prime
    static int isPrime(int num, int i) {
        // Base case: if num is equal to i, it means no factors were found other than 1 and itself, so it's prime
        if (num == i) {
            return 1;
        } else {
            // Check if num is divisible by i, if yes, it's not prime
            if (num % i == 0) {
                return 0;
            } else {
                // Recursive step: increment i and call the isPrime method again
                return isPrime(num, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int i = 2;
        System.out.println("---------------------");
        if (isPrime(num, i) == 1) {
            System.out.println(num + " is a prime number!");
        } else {
            System.out.println(num + " is not a prime number!");
        }
    }
}
