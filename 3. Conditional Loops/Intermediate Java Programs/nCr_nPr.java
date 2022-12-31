import java.util.Scanner;

public class nCr_nPr {

    public static int fact(int n) {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, r, ncr, npr;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("Enter r: ");
        r = sc.nextInt();
        
        ncr = (fact(n))/(fact(n-r));
        npr = (fact(n))/(fact(r)*(fact(n-r)));

        System.out.printf("nCr is %d\nnPr is %d", ncr, npr);

        sc.close();
    }
}
