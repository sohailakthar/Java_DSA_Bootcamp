package Medium;

import java.util.Arrays;

//Did too bad on this problem... Finally solved fter 3 wrong submissions, also it wasn't optimal
//Had to check the official solution   :(   Long way to go
public class SpiralMatrix3 {
    public static int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] result = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, temp;
        for (int j = 0; j < R * C; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                if (0 <= x && x < R && 0 <= y && y < C)
                    result[j++] = new int[] {x, y};
                x += dx;
                y += dy;
            }
            temp = dx;
            dx = dy;
            dy = -temp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralMatrixIII(5, 6, 1, 4)));
    }
}
