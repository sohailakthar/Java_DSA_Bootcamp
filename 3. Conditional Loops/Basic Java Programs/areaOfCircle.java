import java.util.Scanner;

public class areaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        double area = (Math.PI * r * r);
        System.out.printf("Area of Circle with %d radius is %2f", r, area);

        sc.close();
    }
}
