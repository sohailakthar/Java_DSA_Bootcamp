import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] vals = new int[n];
        vals[0] = 0; vals[1] = 1;
        for(int i=2; i<n; i++) {
            vals[i] = vals[i-1]+vals[i-2];
        }
        for(int value :vals) {
            System.out.print(value+", ");
        }
        sc.close();
    }
}
