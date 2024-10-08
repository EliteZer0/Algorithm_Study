import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		int temp = 0;

		/*
		 * 처음 짠 로직
		 * 
		 * for(int i = 0; i<n; i++) {//k번 반복하고 그 상태 그대로 출력.
		 * for(int j = 0; j<n-1-i; j++) {
		 * if(data[j]>data[j+1]) {
		 * temp = data[j];
		 * data[j] = data[j+1];
		 * data[j+1] = temp;
		 * }
		 * }
		 * }
		 * 
		 */

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(data));

		// for(int i = 0; i<n; i++) {
		// System.out.printf("%d ", data[i]);
		// }
	}
}
