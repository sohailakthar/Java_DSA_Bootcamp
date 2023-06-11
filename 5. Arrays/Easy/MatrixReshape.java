package Easy;

import java.util.Arrays;

public class MatrixReshape {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[r][c];
        if((m*n)!=(r*c)) {
            return mat;
        }
        else {
            int index = 0;
            int[] allVal = new int[m*n];
            for(int[] arr:mat) {
                for(int ele:arr) {
                    allVal[index++] = ele;
                }
            }
            index = 0;
            for(int i=0; i<r; i++) {
                for(int j=0; j<c; j++) {
                    res[i][j] = allVal[index++];
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2}, {3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }
}
