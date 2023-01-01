package Easy;

import java.util.Scanner;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int nlength = 2*n;
        int ans[] = new int[nlength];
        for(int i=0; i<n; i++) {
            ans[i+i] = nums[i];
            ans[i+i+1] = nums[i+n];
        }
        return ans;
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

        arr = shuffle(arr, n/2).clone();

        System.out.println("\nAfter: ");
        for(int i:arr)
                System.out.print(i+" ");

        sc.close();
    }
}
