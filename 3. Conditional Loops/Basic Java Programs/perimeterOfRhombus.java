import java.util.Scanner;

public class perimeterOfRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int side, perimeter;
        System.out.print("Enter side: ");
        side = sc.nextInt();
        perimeter = 4*side;
        System.out.printf("Perimeter of rhombus with side:%d is %d", side, perimeter);
        

        sc.close();
    }
}
