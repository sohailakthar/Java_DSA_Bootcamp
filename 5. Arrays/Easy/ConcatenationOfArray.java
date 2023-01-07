import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int nlength = nums.length;
        int[] ans = new int[2*nlength];
        for(int i=0; i<nlength; i++) {
            ans[i] = nums[i];
        }
        for(int i=nlength; i<2*nlength; i++) {
            ans[i] = nums[i-nlength];
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

        arr = getConcatenation(arr).clone();

        System.out.println("\nAfter: ");
        for(int i:arr)
                System.out.print(i+" ");

        sc.close();
    }
}
