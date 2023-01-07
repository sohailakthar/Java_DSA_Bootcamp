import java.util.Scanner;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        int i = 1;
        while(i<nums.length) {
            nums[i] += nums[i-1];
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before: ");
        for(int i:arr)
            System.out.print(i+" ");

        arr = runningSum(arr).clone();

        System.out.println("\nAfter: ");
        for(int i:arr)
                System.out.print(i+" ");

        sc.close();
    }
}
