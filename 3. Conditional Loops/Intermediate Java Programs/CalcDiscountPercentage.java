import java.util.Scanner;

public class CalcDiscountPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Discount (%) = (Discount/List Price) × 100
        double discountPrice, listPrice, discount;
        System.out.print("Enter discount price: ");
        discountPrice = sc.nextInt();
        System.out.print("Enter list price: ");
        listPrice = sc.nextInt();

        discount = (discountPrice/listPrice)*100;

        System.out.printf("Discount(%%) is: %.2f%%",discount);
        
        sc.close();
    }
}
