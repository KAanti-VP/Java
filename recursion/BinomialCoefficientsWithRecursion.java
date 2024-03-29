import java.util.Arrays;
import java.util.Scanner;

public class BinomialCoefficientsWithRecursion {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        int[] binoms = binomials(i);
//        System.out.println(Arrays.toString(binoms));
        for (int i = 0; i < 10; i++) {
            int[] binoms = binomials(i);
            System.out.println(Arrays.toString(binoms));
        }
    }

    public static int[] binomials(int num) {
        if (num == 0) return new int[] {1};
        if (num == 1) return new int[] {1, 1};
        return binomials(num, new int[] {1, 1});
    }

    public static int[] binomials(int num, int[] arr) {
        if (arr.length < num + 1) {
            int[] res = new int[arr.length + 1];
            res[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                res[i] = arr[i-1] + arr[i];
            }
            res[res.length - 1] = 1;
            return binomials(num, res);
        } else {
            return arr;
        }
    }
}
