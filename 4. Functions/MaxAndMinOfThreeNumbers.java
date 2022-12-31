import java.util.Scanner;

public class MaxAndMinOfThreeNumbers {

    public static int max(int a, int b, int c) {
        return Math.max(a, (Math.max(b, c)));
    }

    public static int min(int a, int b, int c) {
        return Math.min(a, (Math.min(b, c)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        System.out.printf("Max(%d, %d, %d) is %d\n", a, b, c, max(a, b, c));
        System.out.printf("Min(%d, %d, %d) is %d", a, b, c, min(a, b, c));

        sc.close();
    }
}
