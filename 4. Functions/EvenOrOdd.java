import java.util.Scanner;

public class EvenOrOdd {

    public static boolean isEven(int n) {
        if(n%2 == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if(isEven(n))
            System.out.println(n+" is even.");
        else
            System.out.println(n+" is Odd.");

        sc.close();
    }
}
