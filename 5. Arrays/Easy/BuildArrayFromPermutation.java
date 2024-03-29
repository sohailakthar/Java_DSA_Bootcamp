import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int nlength = nums.length;
        int ans[] = new int[nlength];
        for(int i=0; i<nlength; i++) {
            ans[i] = nums[nums[i]];
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

        arr = buildArray(arr).clone();

        System.out.println("\nAfter: ");
        for(int i:arr)
                System.out.print(i+" ");

        sc.close();
    }
}
