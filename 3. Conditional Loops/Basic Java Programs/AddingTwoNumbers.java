import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter first number: ");
        sum += sc.nextInt();
        System.out.print("Enter second number: ");
        sum += sc.nextInt();
        System.out.println("Sum is: "+sum);

        sc.close();
    }
}
