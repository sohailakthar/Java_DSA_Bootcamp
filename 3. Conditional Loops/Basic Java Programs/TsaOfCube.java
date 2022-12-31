import java.util.Scanner;

public class TsaOfCube {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int side, csa;
        System.out.print("Enter side: ");
        side = sc.nextInt();
        csa = 6*side*side;

        System.out.printf("Total Surface Area of cube with side:%d is: %d", side, csa);


        sc.close();
    }
}
