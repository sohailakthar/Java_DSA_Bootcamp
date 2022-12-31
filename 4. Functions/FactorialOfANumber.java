import java.util.Scanner;

public class FactorialOfANumber {

    public static int factorial(int n) {
        if(n==0 || n==1) 
            return 1;
        else
            return n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.printf("Factorial of %d is %d", n, factorial(n));

        sc.close();
    }
}
