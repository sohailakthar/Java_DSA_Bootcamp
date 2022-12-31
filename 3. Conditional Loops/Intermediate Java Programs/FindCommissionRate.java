import java.util.Scanner;

public class FindCommissionRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total, commission;
        System.out.print("Enter Total: ");
        total = sc.nextInt();
        System.out.print("Enter Commision Earned: ");
        commission = sc.nextInt();
        
        
        System.out.printf("Commission rate is: %.2f%%",((commission/total)*100));

        sc.close();
    }
}
