import java.util.Scanner;

public class PalindromeOrNot {

    public static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while(temp != 0) {
            rev = (rev*10)+(temp%10);
            temp /= 10;
        }
        if(rev == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if(isPalindrome(n))
            System.out.printf("%d is a palindrome.", n);
        else
            System.out.printf("%d is not a palindrome.", n);

        sc.close();
    }
}
