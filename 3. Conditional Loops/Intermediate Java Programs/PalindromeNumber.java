import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, temp, rev=0;
        System.out.print("Enter number: ");
        n = temp = sc.nextInt();
        while(temp != 0) {
            rev = (rev*10)+(temp%10);
            temp /= 10;
        }
        if(rev == n)
            System.out.printf("Reverse of %d is %d. So it is palindrome.", n, rev);
        else
        System.out.printf("Reverse of %d is %d. So it is not palindrome.", n, rev);

        sc.close();
    }
}
