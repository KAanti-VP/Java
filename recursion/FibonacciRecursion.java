import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The " + num + "th Fibonavvcci number is " + fibonacci(num - 1));
    }

    public static int fibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
