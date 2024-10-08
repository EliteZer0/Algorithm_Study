import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] snail = new int[n][n];

        int row = 0;
        int col = 0;
        int[] dr = { 0, 1, 0, -1 };// 우하좌상
        int[] dc = { 1, 0, -1, 0 };
        int direction = 0;
        int snailnum = 1;

        while (snailnum < n * n + 1) {
            snail[row][col] = snailnum++;
            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];

            if (nextRow < 0 || nextRow > n - 1 || nextCol < 0 || nextCol > n - 1 || snail[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4;
                nextRow = row + dr[direction];
                nextCol = col + dc[direction];
            }

            row = nextRow;
            col = nextCol;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", snail[i][j]);
            }
            System.out.println();
        }

    }
}
