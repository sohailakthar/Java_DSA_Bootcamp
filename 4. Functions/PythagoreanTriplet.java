import java.util.Scanner;

public class PythagoreanTriplet {
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int largeVal, smallVal, midVal;
        largeVal = Math.max(a, Math.max(b, c));
        smallVal = Math.min(a, Math.min(b, c));
        midVal = a+b+c-(largeVal+smallVal);
        if(Math.pow(largeVal, 2)==(Math.pow(smallVal, 2)+Math.pow(midVal, 2)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if(isPythagoreanTriplet(a, b, c))
            System.out.printf("%d, %d & %d is a pythagorean triplet.", a, b, c);
        else
        System.out.printf("%d, %d & %d is not pythagorean triplet.", a, b, c);
        
        sc.close();
    }
}
