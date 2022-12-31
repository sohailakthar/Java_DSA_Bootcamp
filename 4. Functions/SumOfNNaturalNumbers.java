import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static int sumOfN(int n) {
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.printf("Sum of first %d natural numbers is: %d", n, sumOfN(n));

        sc.close();
    }
    
}
