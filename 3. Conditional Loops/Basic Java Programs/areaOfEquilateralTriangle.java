import java.util.Scanner;

public class areaOfEquilateralTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int side;
        double area;

        System.out.print("Enter side: ");
        side = sc.nextInt();
        area = (Math.sqrt(3)/4)*side*side;
        System.out.printf("Area of triangle with side:%d is %.2f", side, area);
        

        sc.close();
    }
}
