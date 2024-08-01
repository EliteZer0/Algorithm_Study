import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        for (int trys = 0; trys < testcases; trys++) {
            int days = Integer.parseInt(br.readLine());
            int[] prices = new int[days];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < days; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            long profit = 0;
            int maxPrice = 0;
            // 뒤에서부터 최대가격 추적하면 무조건 그 가격에 팔아야함. 자기보다 뒷번호에 최댓값 없으면 자기자신이 최댓값이라 이익 0. for문을 줄일 수 있는 방법.
            for (int i = days - 1; i >= 0; i--) {

                if (maxPrice < prices[i]) {
                    maxPrice = prices[i];
                }

                profit += maxPrice - prices[i];
            }
            System.out.printf("#%d %d\n", trys + 1, profit);
        }
    }
}
