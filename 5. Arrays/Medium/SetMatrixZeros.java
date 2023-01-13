package Medium;

//https://leetcode.com/problems/set-matrix-zeroes/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        int m, n, i, j;
        m = matrix.length;
        n = matrix[0].length;
        List<Integer> rowZero = new ArrayList<Integer>();
        List<Integer> colZero = new ArrayList<Integer>();
        for(i=0; i<m; i++) {
            for(j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    if(!(rowZero.contains(i))) {
                        rowZero.add(i);
                    }
                    if(!(colZero.contains(j))) {
                        colZero.add(j);
                    }
                }
            }
        }
        for(i=0; i<rowZero.size(); i++) {
            for(j=0; j<n; j++) {
                matrix[rowZero.get(i)][j] = 0;
            }
        }
        for(i=0; i<colZero.size(); i++) {
            for(j=0; j<m; j++) {
                matrix[j][colZero.get(i)] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
