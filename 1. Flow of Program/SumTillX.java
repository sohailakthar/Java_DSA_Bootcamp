import java.util.Scanner;

public class SumTillX {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean flag = true;
        while(flag) {
            String val = sc.next();
            if(val.equalsIgnoreCase("x")) {
                flag = false;
            } else {
                result += Integer.parseInt(val);
            }
        }
        System.out.println("Sum: "+result);
    }
}
