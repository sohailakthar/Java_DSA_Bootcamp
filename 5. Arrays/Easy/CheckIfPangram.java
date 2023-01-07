import java.util.Scanner;

public class CheckIfPangram {
    
    public static boolean checkIfPangram(String sentence) {
        int mask = 0;
        sentence = sentence.replace(" ", "");
        for(char c:sentence.toCharArray()) {
            mask |= (1<<(c-'a'));
        }
        return (mask+1 == 67108864);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String sentence = sc.nextLine();

        if(checkIfPangram(sentence))
            System.out.println("Given sentence is a pangram");
        else
            System.out.println("Given sentence is not a pangram");

        sc.close();
    }
}
