import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, power;

        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();

        System.out.printf("%d power %d is: %.1f", base, power, Math.pow(base, power));

        sc.close();
    }
}
