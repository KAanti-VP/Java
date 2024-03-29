import java.util.Scanner;

public class SumOfRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The sum to " + num + " is " + sumTo(num));
    }

    private static int sumTo(int num) {
        return (num == 1) ? 1 : num + sumTo(num - 1);
    }
}
