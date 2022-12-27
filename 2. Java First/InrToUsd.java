import java.util.Scanner;

public class InrToUsd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //At the time of writing this program, 1USD = 82.82INR
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        System.out.printf("%.2f INR is %.2f USD", inr, (inr/82.82)); //2 decimal precision
        sc.close();
    }
}
