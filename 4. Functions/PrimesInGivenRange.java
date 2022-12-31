import java.util.Scanner;

public class PrimesInGivenRange {

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) 
                return false;
        }
        return true;
    }

    public static void printPrimes(int a, int b) {
        for(int i=a; i<=b; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter range(two numbers): ");
        a = sc.nextInt();
        b = sc.nextInt();

        printPrimes(a, b);

        sc.close();
        
    }
}
