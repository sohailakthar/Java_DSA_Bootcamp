import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Largest: "+Math.max(a,b));
        sc.close();

    }
}
