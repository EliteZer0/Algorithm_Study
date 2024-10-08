import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int n = 8;
		int[] data = { 33, 21, 55, 44, 83, 243, 62, 76 };

		for (int i = 0; i < n - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (data[minIndex] > data[j]) {
					minIndex = j;
				}
			}

			int temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}

		System.out.println(Arrays.toString(data));
	}
}
