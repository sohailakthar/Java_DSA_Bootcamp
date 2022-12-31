import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int length, width, perimeter;
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
        perimeter = 2*(length+width);
        System.out.printf("Perimeter of rectangle with length:%d and width:%d is %d", length, width, perimeter);
        

        sc.close();
    }
}
