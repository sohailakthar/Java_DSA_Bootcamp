package Easy;

import java.util.Scanner;

public class CellsWithOddValuesInMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;
        for(int[] arr:indices) {
                for(int i=0; i<n; i++)
                    matrix[arr[0]][i]++;
                for(int i=0; i<m; i++)
                    matrix[i][arr[1]]++;
        }
        for(int[] arr:matrix) {
            for(int val:arr) {
                if(val%2 != 0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m, n;
        int[][] index = {{0,1},{1,1}};
        System.out.print("Enter no of rows(m): ");
        m = sc.nextInt();
        System.out.print("Enter no of columns(n): ");
        n = sc.nextInt();

        System.out.println("Number of odd elements: "+oddCells(m, n, index));

        sc.close();
    }
}
