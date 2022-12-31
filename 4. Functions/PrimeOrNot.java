import java.util.Scanner;

public class PrimeOrNot {

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if(isPrime(n))
            System.out.printf("%d is prime", n);
        else
        System.out.printf("%d is not prime", n);
            
        sc.close();
    }
}
