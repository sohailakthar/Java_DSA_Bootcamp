import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum;

        System.out.print("Enter n: ");
        n = sc.nextInt();
        
        sum = (n*(n+1))/2;

        System.out.printf("Sum of first %d numbers is: %d", n, sum);

        sc.close();
    }
}
