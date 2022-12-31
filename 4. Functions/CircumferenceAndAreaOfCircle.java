import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {

    public static void calc(int r) {
        double circumference = 2*Math.PI*r;
        double area = Math.PI*r*r;
        System.out.printf("Circumference: %.2f\nArea: %.2f", circumference, area);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;

        System.out.print("Enter radius: ");
        r = sc.nextInt();

        calc(r);

        sc.close();
    }
}
