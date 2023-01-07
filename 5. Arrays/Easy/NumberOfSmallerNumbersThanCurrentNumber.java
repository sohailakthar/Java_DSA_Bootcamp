import java.util.Scanner;

public class NumberOfSmallerNumbersThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        for(int i=0; i<length; i++) {
            int count = 0;
            for(int j=0; j<length; j++) {
                if(i!=j && nums[i]>nums[j])
                    count++;
            }
            ans[i] = count;
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
        System.out.println("Input: ");
        for(int i:arr)
            System.out.print(i+" ");

        arr = smallerNumbersThanCurrent(arr).clone();

        System.out.println("\nOutput: ");
        for(int i:arr)
                System.out.print(i+" ");

        sc.close();
    }
}
