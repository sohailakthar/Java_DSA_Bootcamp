import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;
        System.out.print("Enter first point(x1, y1): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Enter second point(x2, y2): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));

        System.out.printf("Distance between (%d, %d) and (%d, %d) is: %.2f", x1, y1, x2, y2, distance);

        sc.close();
    }
}
