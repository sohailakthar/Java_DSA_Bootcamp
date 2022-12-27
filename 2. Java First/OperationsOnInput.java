import java.util.Scanner;

public class OperationsOnInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter an operation(+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        if(op == '+')
            System.out.println("Sum: "+(a+b));
        else if(op == '-')
            System.out.println("Difference: "+(a-b));
        else if(op == '*')
            System.out.println("Product: "+(a*b));
        else if(op == '/')
            System.out.println("Division: "+(a/b));
        else if(op == '%')
            System.out.println("Remainder: "+(a%b));
        
        //using Switch
        switch(op) {
            case '+':
                System.out.println("Sum: "+(a+b));
                break;
            case '-':
                System.out.println("Difference: "+(a-b));
                break;
            case '*':
                System.out.println("Product: "+(a*b));
                break;
            case '/':
                System.out.println("Division: "+(a/b));
                break;
            case '%':
                System.out.println("Remainder: "+(a%b));
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
        sc.close();
    }
}
