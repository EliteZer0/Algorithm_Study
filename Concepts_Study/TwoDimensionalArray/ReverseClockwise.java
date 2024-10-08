import java.util.Arrays;

public class ReverseClockwise {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = matrix.length;
        int[][] rClockwise = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rClockwise[n - 1 - j][i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(rClockwise));
    }
}
