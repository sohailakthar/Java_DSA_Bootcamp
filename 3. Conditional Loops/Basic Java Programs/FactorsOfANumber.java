import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.printf("Factors of %d are: ", n);

        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}
