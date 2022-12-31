import java.util.Scanner;

public class perimeterOfSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int side, perimeter;
        System.out.print("Enter side: ");
        side = sc.nextInt();
        perimeter = 4*side;
        System.out.printf("Perimeter of square with side:%d is %d", side, perimeter);
        

        sc.close();
    }
}
