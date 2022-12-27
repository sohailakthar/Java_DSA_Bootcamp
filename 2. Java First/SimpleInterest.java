import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Formula for Simple Interest is: A = P (1 + rt)
        System.out.print("Enter principal amount(P): ");
        int p = sc.nextInt();
        System.out.print("Enter time(T): ");
        int t = sc.nextInt();
        System.out.print("Enter rate(R): ");
        double r = sc.nextDouble();
        System.out.println("Simple Interest is: "+p*(1+(r*t)));
        sc.close();
    }
}
