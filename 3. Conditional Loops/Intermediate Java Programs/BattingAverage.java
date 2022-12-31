import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int runs, out;
        
        System.out.print("Enter total runs: ");
        runs = sc.nextInt();
        System.out.print("Enter number of times out: ");
        out = sc.nextInt();

        System.out.println("Batting Average is: "+(runs/out));

        sc.close();
    }
}
