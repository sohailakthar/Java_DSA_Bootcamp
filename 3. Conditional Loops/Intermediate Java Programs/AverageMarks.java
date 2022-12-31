import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum=0;
        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.printf("Enter marks for subject %d: ", i+1);
            sum += sc.nextInt();
        }
        System.out.println("Average marks: "+((double)sum/n));

        sc.close();
    }
}
