import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static int product(int a, int b) {
        return a*b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Product is: "+product(a, b));

        sc.close();
    }
}
