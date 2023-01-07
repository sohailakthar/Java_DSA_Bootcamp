public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;

        for(int i=0; i<n; i++) {
            sum += mat[i][i]+mat[i][n-1-i];
        }
        if(n%2 != 0) {
            int val = (int)Math.ceil(n/2);
            sum -= mat[val][val];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println("Sum of diagonals is: "+diagonalSum(matrix));
    }
}
