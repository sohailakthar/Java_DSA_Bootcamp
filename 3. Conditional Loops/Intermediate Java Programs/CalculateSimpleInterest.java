import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*A = P(1+(r/n))^nt 
            A	=	final amount
            P	=	initial principal balance
            r	=	interest rate
            n	=	number of times interest applied per time period
            t	=	number of time periods elapsed
        */

        double simpleInterest, principal, interest, timesInterestApplied, timePeriod;
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter interest: ");
        interest = sc.nextDouble();
        System.out.print("Enter number of times interest applied: ");
        timesInterestApplied = sc.nextDouble();
        System.out.print("Enter time period: ");
        timePeriod = sc.nextDouble();

        simpleInterest = principal*Math.pow((1+(interest/timesInterestApplied)), (timesInterestApplied*timePeriod));

        System.out.println("Simple interest is: "+(principal-simpleInterest));

        sc.close();
    }
}
