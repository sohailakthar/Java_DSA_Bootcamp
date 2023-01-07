import java.util.ArrayList;
import java.util.Scanner;

public class TargetInGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            ans.add(index[i], nums[i]);
        }
        
        int ansArr[] = new int[n];
        for(int i=0; i<n; i++) {
            ansArr[i] = ans.get(i);
        }

        return ansArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        int index[] = new int[n];

        System.out.println("Enter elements of nums array: ");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter elements of index array: ");
        for(int i=0; i<n; i++) {
            index[i] = sc.nextInt();
        }

        int[] arr = createTargetArray(nums, index).clone();

        System.out.println("\nOutput: ");
        for(int i:arr)
                System.out.print(i+" ");

        sc.close();
    }
}
