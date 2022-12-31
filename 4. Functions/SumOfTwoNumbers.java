import java.util.Scanner;

public class SumOfTwoNumbers {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("Sum of %d and %d is: %d", a, b, sum(a, b));

        sc.close();
    }
    
}
