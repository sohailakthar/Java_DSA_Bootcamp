import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
        String result = "";
        for(int i=input.length()-1; i>=0; i--) {
            result += input.charAt(i);
        }
        if(input.equals(result))
            System.out.println("Reverse of "+input+" is "+result+"\nSo it is a palindrome.");
        else
            System.out.println("Reverse of "+input+" is "+result+"\nSo it is not a palindrome.");
        sc.close();
    }
}
