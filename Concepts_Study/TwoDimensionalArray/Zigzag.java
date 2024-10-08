import java.util.Arrays;

public class Zigzag {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                if (i % 2 != 0) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                    matrix[i][matrix[0].length - 1 - j] = temp;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
