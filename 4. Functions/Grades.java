import java.util.Scanner;

public class Grades {

    public static void grade(int n) {
        if(n>90 && n<=100)
            System.out.println("AA");
        else if(n>80 && n<=90)
            System.out.println("AB");
        else if(n>70 && n<=80)
            System.out.println("BB");
        else if(n>60 && n<=70)
            System.out.println("BC");
        else if(n>50 && n<=60)
            System.out.println("CD");
        else if(n>40 && n<=50)
            System.out.println("DD");
        else if(n<=40)
            System.out.println("FAIL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter your marks: ");
        n = sc.nextInt();

        grade(n);

        sc.close();
    }
}
