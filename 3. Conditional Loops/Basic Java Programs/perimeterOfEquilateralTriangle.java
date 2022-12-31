import java.util.Scanner;

public class perimeterOfEquilateralTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int side;
        int perimeter;

        System.out.print("Enter radius: ");
        side = sc.nextInt();
        perimeter = 3*side;
        System.out.printf("Perimeter of equilateral triangle with side:%d is %d", side, perimeter);
        

        sc.close();
    }
}
