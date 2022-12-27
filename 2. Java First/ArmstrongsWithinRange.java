import java.util.Scanner;


public class ArmstrongsWithinRange {

    /* Armstrong: A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself
     * (1^3)+(5^3)+(3^3)=153     3 is the length of 153
     */

    //function to check if a number n is armstrong or not
    public static boolean isArmstrong(int n) {
        int length = Integer.toString(n).length();
        int temp=n, res=0;
        while(temp!=0) {
            res = (int)((res)+Math.pow((temp%10), length));
            temp /= 10;
        }
        if(res == n)
            return true;
        else   
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter range(two numbers): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b; i++) {
            if(isArmstrong(i))
                System.out.print(i+", ");
        }

        sc.close();
    }
}
