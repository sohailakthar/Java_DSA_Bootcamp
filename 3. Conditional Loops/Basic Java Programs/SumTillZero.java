import java.util.Scanner;

public class SumTillZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;
        while(true) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if(n!=0)
                sum += n;
            else
                break;
        }
        System.out.println("Sum is: "+sum);
        
        sc.close();
    }
}
