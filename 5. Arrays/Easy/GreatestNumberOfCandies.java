import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = 0;
        for(int i : candies) {
            max = Math.max(i, max);
        }
        for(int i : candies) {
            if(i+extraCandies>=max) {
                ans.add(true);
            }
            else {
                ans.add(false);
            }
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
        System.out.print("Enter number of extra candies: ");
        int extraCandies = sc.nextInt();

        System.out.println("\nCandies: ");
        for(int i:arr)
            System.out.print(i+" ");

        List<Boolean> ans = new ArrayList<Boolean>(kidsWithCandies(arr, extraCandies));

        System.out.println("\nBoolean List: ");
        for(Boolean i:ans)
                System.out.print(i+" ");

        sc.close();
    }
}
