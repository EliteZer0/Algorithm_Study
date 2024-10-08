import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열의 크기를 입력하세요 : ");
		int n = sc.nextInt();

		int[] data = new int[n];
		System.out.println("배열의 요소를 입력하세요 : ");
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		System.out.println("찾으려는 값을 입력하세요 : ");
		int answer = sc.nextInt();

		Arrays.sort(data);

		int left = 0;
		int right = n - 1;
		boolean exist = false;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (data[mid] == answer) {
				exist = true;
				break;
			} else if (data[mid] < answer) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println(exist);

	}
}
