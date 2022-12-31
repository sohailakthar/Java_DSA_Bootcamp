import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum=0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("Enter a number: ");
            sum += sc.nextInt();
        }
        System.out.println("Average of the numbers: "+((double)sum/n));

        sc.close();
    }
}
