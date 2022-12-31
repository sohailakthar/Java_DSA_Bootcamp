import java.util.Scanner;

public class SubtractProductAndSumOfDigits {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        
        int product=1, sum=0, n, temp;

        System.out.print("Enter number: ");
        n = sc.nextInt();
        temp = n;
        while(temp!=0) {
            sum += temp%10;
            product *= temp%10;
            temp /= 10;
        }
        System.out.println(product+"\t"+sum);
        System.out.println("Difference of product & sum of digits is: "+(product-sum));

        sc.close();
    }
}
