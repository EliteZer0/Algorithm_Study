import java.util.Arrays;

public class Clockwise {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = matrix.length;
        int[][] clockwise = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                clockwise[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(clockwise));
    }
}
