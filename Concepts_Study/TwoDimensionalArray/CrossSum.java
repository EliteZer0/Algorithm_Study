public class CrossSum {
    public static void main(String[] args) {
        int n = 5;

        int[][] matrix = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 2, 2 }, { 1, 1, 1, 2, 1 }, { 1, 9, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = matrix[i][j];
                // 상
                if (i > 0) {
                    sum += matrix[i - 1][j];
                }
                // 하
                if (i < n - 1) {
                    sum += matrix[i + 1][j];
                }
                // 좌
                if (j > 0) {
                    sum += matrix[i][j - 1];
                }
                // 우
                if (j < n - 1) {
                    sum += matrix[i][j + 1];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
