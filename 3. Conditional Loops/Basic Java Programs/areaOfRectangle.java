import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int length, breadth, area;
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        area = length*breadth;
        System.out.printf("Area of rectangle with %d length and %d breadth is %d", length, breadth, area);

        sc.close();
    }
}
