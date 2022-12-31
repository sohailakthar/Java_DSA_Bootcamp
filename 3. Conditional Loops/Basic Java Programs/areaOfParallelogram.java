import java.util.Scanner;

public class areaOfParallelogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int base, height, area;

        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        area = (base*height);
        System.out.printf("Area of parallelogram with base:%d and height:%d is %d", base, height, area);
        

        sc.close();
    }
}
