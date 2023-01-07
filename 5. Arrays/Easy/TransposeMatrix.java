public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int[][] result = transpose(matrix).clone();
        System.out.println("Transpose of the matrix is: ");
        for(int[] arr:result) {
            for(int i:arr) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
