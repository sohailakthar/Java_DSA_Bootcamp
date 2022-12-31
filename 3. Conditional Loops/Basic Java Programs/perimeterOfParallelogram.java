import java.util.Scanner;

public class perimeterOfParallelogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int base, side, perimeter;

        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter side: ");
        side = sc.nextInt();
        perimeter = 2*(base+side);
        System.out.printf("Perimeter of parallelogram with base:%d and side:%d is %d", base, side, perimeter);
        

        sc.close();
    }
}
