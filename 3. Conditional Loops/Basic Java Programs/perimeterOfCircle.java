import java.util.Scanner;

public class perimeterOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int r;
        double perimeter;

        System.out.print("Enter radius: ");
        r = sc.nextInt();
        perimeter = 2*Math.PI*r;
        System.out.printf("Perimeter of circle with radius:%d is %.2f", r, perimeter);
        

        sc.close();
    }
}
