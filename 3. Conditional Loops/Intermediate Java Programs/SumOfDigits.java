import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum=0, temp;
        System.out.print("Enter a number: ");
        temp = n = sc.nextInt();
        while(temp != 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.printf("Sum of digits of %d is %d", n, sum);

        sc.close();
    }
}
