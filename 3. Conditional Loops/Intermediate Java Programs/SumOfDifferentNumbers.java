import java.util.Scanner;

public class SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, negSum=0, posEvenSum=0, posOddSum=0;
        while(true) {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if(n == 0)
                break;
            else if(n>0 && n%2==0)
                posEvenSum += n;
            else if(n>0 && n%2!=0)
                posOddSum += n;
            else if(n<0)
                negSum += n;
        }
        System.out.printf("Sum of negative numbers: %d\nSum of positive even numbers: %d\nSum of positive odd numbers: %d", negSum, posEvenSum, posOddSum);

        sc.close();
    }
}
