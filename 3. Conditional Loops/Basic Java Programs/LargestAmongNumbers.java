import java.util.Scanner;

public class LargestAmongNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, max = Integer.MIN_VALUE;
        while(true) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if(n!=0)
                max = (n>max)?n:max;
            else
                break;
        }
        System.out.println("Max is: " +max);
        
        sc.close();
    }
}
