package Easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {

    //function returns the column(index) of minimum element in the array
    public static int findMinInRow(int[] mat) {
        int min = 0;
        for(int i=0; i<mat.length; i++) {
            min = (mat[i]<mat[min])?i:min;
        }
        return min;
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length;
		int n = matrix[0].length;
        if(m==n || m<n) {
            outer:
            for(int i=0; i<m; i++) {
                int min = findMinInRow(matrix[i]);
                for(int j=0; j<m; j++) {
                    if(!(matrix[i][min]>=matrix[j][min]))
                        continue outer;
                }
                res.add(matrix[i][min]);
            }
        }
        else if(n<m) {
            for(int i=0; i<n; i++) {
                int max=0;
                for(int k=0; k<m; k++) {
                    max = (matrix[k][i]>matrix[max][i])?k:max;
                }
                if(findMinInRow(matrix[max])==i)
                    res.add(matrix[max][i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
}
