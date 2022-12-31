import java.util.Scanner;

public class VoteEligibility {

    public static boolean isEligible(int age) {
        if(age>=18)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if(isEligible(age)) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
