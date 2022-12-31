import java.util.Scanner;

public class CsaOfCylinder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int radius, height;
        double csa;
        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        csa = 2*Math.PI*radius*height;

        System.out.printf("Curved Surface Area of cylinder with given dimensions is: %d", csa);

        sc.close();
    }
}
