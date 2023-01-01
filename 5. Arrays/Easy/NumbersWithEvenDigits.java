package Easy;

import java.util.Scanner;

public class NumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums) {
            if((Integer.toString(i).length())%2==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.printf("There are %d numbers with even number of digits.", findNumbers(nums));

        sc.close();
    }
}
