package Easy;

public class MatrixRotation {
    public static int[][] rotateMat(int[][] mat) {
        int n = mat.length;
        int i, j, k;
        int[][] transposeMat = new int[n][n];
        int[][] rotatedMat = new int[n][n];
        for(i=0; i<n; i++) {
            for(j=0; j<n; j++) {
                transposeMat[i][j] = mat[j][i];
            }
        }
        for(i=0, k=n-1; (i<n && k>=0); i++, k--) {
            for(j=0; j<n; j++) {
                rotatedMat[j][k] = transposeMat[j][i];
            }
        }
        return rotatedMat;
    }
    
    public static boolean isEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(mat1[i][j] != mat2[i][j])
                    return false;
            }
        }
        return true;
    }
    
    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++) {
            if(isEqual(mat, target)) {
                return true;
            }
            mat = rotateMat(mat).clone();
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat, target));
    }
}
