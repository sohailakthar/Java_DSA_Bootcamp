import java.util.Scanner;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j])
                    result++;
            }
        }
        return result;
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
        
        int result = numIdenticalPairs(arr);

        System.out.println("\nNumber of Good Pairs: "+result);

        sc.close();
    }
}
