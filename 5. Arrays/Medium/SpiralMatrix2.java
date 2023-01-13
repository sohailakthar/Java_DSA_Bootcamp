package Medium;
import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/spiral-matrix-ii/description/
public class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top, left, bottom, right;
        top = left = 0;
        bottom = right = n;
        int val = 1;
        while((top<bottom) && (left<right)) {
            for(int i=left; i<right; i++) {
                matrix[top][i] = val++;
            }
            top++;
            
            for(int i=top; i<bottom; i++) {
                matrix[i][right-1] = val++;
            }
            right--;
            
            if(!((left<right) && (top<bottom)))
                break;
                
            for(int i=right-1; i>=left; i--) {
                matrix[bottom-1][i] = val++;
            }
            bottom--;
            
            for(int i=bottom-1; i>=top; i--) {
                matrix[i][left] = val++;
            }
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(n): ");
        int n = sc.nextInt();
        System.out.println(Arrays.deepToString(generateMatrix(n)));
        sc.close();
    }
}
