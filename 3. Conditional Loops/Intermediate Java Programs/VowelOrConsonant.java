import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter char: ");
        char c = sc.nextLine().toLowerCase().charAt(0);

        if(c==97 || c==101 || c==105 || c==111 || c==117)
            System.out.printf("%c is a vowel.", c);
        else if(c>97 && c<123)
            System.out.printf("%c is a consonant.", c);
        else
            System.out.println("Invalid.");

        sc.close();
    }
}
