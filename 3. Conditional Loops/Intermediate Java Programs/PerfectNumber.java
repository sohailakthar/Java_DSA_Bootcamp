import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum=0;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        if(sum == n)
            System.out.printf("%d is a perfect number.", n);
        else
            System.out.printf("%d is not a perfect number.", n);

        sc.close();
    }
}
