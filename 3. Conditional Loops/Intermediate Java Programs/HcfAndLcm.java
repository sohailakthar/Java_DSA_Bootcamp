import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter two numbers: ");
        int a, b, result, num;
        a = num = sc.nextInt();
        b = sc.nextInt();

        //Code for HCF
        int rem  = result = Math.max(a, b)%Math.min(a, b);
        while(rem!=0) {
            result = rem;
            rem = a%rem;
            a = result;
        }
        System.out.println("HCF: "+result);

        //Code for LCM
        System.out.println("LCM: "+((num*b)/result));
        sc.close();
    }
}
