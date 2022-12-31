import java.util.Scanner;

public class ReverseTheString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
        String result = "";
        for(int i=input.length()-1; i>=0; i--) {
            result += input.charAt(i);
        }
        
        System.out.println("Reverse of "+input+" is "+result);

        sc.close();
    }
}
